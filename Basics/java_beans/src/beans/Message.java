package beans;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Learn Java Beans
 *
 * @author Alex T.H.
 * @version v0.4.5
 * @since 20.0.0 2024-05-10
 */
public class Message implements Serializable {

    private String sender;
    private String receiver;
    private LocalDateTime dateTime;
    private String messageToSend;

    public Message() {
    }

    public Message(String sender, String receiver, LocalDateTime dateTime, String messageToSend) {
        this.sender = sender;
        this.receiver = receiver;
        this.dateTime = dateTime;
        this.messageToSend = messageToSend;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime() {
        this.dateTime = LocalDateTime.now();
    }

    public String getMessageToSend() {
        return messageToSend;
    }

    public void setMessageToSend(String messageToSend) {
        this.messageToSend = messageToSend;
    }

    @Override
    public String toString() {
        return "Message{" + "sender='" + sender + '\'' + ", receiver='" + receiver + '\'' + ", dateTime=" + dateTime + ", messageToSend='" + messageToSend + '\'' + '}';
    }
}
