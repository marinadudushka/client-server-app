import java.time.LocalDate;
import java.time.LocalTime;

public class Message {
    private String sender;
    private String message;
    private LocalDate date;
    private LocalTime time;

    public Message(String sender, String message) {
        this.sender = sender;
        this.message = message;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    @Override
    public String toString() {
        return  sender + ": "+ message +
                "sent: " + time +
                " " + date;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
