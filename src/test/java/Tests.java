import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.ua.task1.FacebookUser;
import ucu.edu.ua.task1.FacebookUserAdapter;
import ucu.edu.ua.task1.MessageSender;
import ucu.edu.ua.task1.User;

public class Tests {
    private User user;
    private FacebookUser facebookUser;
    private FacebookUserAdapter facebookUserAdapter;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        facebookUser = new FacebookUser("facebook.mail", "Ukraine", LocalDateTime.now());
        facebookUserAdapter = new FacebookUserAdapter(facebookUser);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testFacebookUserAdapterSend() {
        MessageSender messageSender = new MessageSender();
        messageSender.send(facebookUserAdapter, "Hello, World!");
        String actual = outContent.toString();
        assertEquals("", actual);

    }

    

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
