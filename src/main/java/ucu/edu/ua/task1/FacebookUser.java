package ucu.edu.ua.task1;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor @ToString @Data
public class FacebookUser {
    private String email;
    private String country;
    private LocalDateTime activeTime;

    public String getEmail() {
        return email;
    }
    
    public String getUserCountry() {
        return country;
    }

    public LocalDateTime getUserActiveTime() {
        return activeTime;
    }
}
