import java.time.LocalDateTime;

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

    @BeforeEach
    public void setUp() {
        facebookUser = new FacebookUser("facebook.mail", "Ukraine", LocalDateTime.now());
        facebookUserAdapter = new FacebookUserAdapter(facebookUser);
    }

    @Test
    public void testFacebookUserAdapter() {
        assertEquals(facebookUserAdapter.getMail(), facebookUser.getEmail());
        assertEquals(facebookUserAdapter.getCountry(), facebookUser.getCountry());
        assertEquals(facebookUserAdapter.getActiveTime(), facebookUser.getActiveTime());
    }
}
