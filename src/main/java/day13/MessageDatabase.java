package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }



    public static List<Message> getMessagesBad () {
        List<Message> allMessage = new ArrayList<>(); //создаем новый список с название allMessage
        allMessage.addAll(messages); //записываем все данные из списка messages в список allMessage
        return allMessage; //возвращаем список allMessage
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2) {
                System.out.printf("%s: %s\n", u1, message.getText());
            }
            if (message.getSender() == u2 && message.getReceiver() == u1) {
                System.out.printf("%s: %s\n", u2, message.getText());
            }
        }
    }
}

