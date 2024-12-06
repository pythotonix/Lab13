package ucu.edu.ua.task1;

import java.time.LocalDateTime;

public interface User { //в інтерфейсі не може бути змінних
    public String getMail();
    
    public String getCountry();

    public LocalDateTime getActiveTime();
}
