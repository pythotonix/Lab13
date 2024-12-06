import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.ua.task1.FacebookUser;
import ucu.edu.ua.task1.FacebookUserAdapter;
import ucu.edu.ua.task1.MessageSender;
import ucu.edu.ua.task1.User;

public class Tests {
    private MessageSender messageSender;
    private FacebookUser facebookUser;

    @BeforeEach
    public void setUp() {
        messageSender = new MessageSender();
    }

    @Test
    public void testMainWithFacebookUser() {
        facebookUser = new FacebookUser("facebook.mail", "Ukraine", LocalDateTime.now());
        User user = new FacebookUserAdapter(facebookUser);
        messageSender.send(user, "Hello, World!");
        assertEquals("facebook.mail", user.getMail());
        assertEquals("Ukraine", user.getCountry());
    }
}
