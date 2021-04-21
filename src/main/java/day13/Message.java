package day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Message {

    Calendar calendar = new GregorianCalendar();
    SimpleDateFormat format = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");

    private User sender;
    private User receiver;
    private String text;
    private String date;

    public Message (User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = format.format(calendar.getTime());
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "From: " + sender + "\nTo: " + receiver + "\nON: " + date + "\n" + text + "\n";
    }
}
