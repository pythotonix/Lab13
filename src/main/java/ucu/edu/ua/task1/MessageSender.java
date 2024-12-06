package ucu.edu.ua.task1;

public class MessageSender {
    public void send(User user, String text) {
        System.out.println("Sending message to " + user);
        System.out.println("Message content: " + text);
    }
}
