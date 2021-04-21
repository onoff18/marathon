package day13;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Jhon");
        User user2 = new User("Mike");
        User user3 = new User("Anna");

        user1.sendMessage(user3, "Привет");
        user3.sendMessage(user1, "Дароу, как сам?");
        user1.sendMessage(user3, "Ебланю помаленьку");
        user2.sendMessage(user1, "Кто там тебе пишет?");
        user2.sendMessage(user1, "Ау");
        user2.sendMessage(user1, "Ау, блядь");
        user1.sendMessage(user2, "Да че ты приебался то?");
        user1.sendMessage(user2, "Заняться нечем?");
        user1.sendMessage(user3, "Мне тут опять это дибил пишет");
        user3.sendMessage(user1, "Чего хочет?");

//        user1.sendMessage(user2, "");
//        user1.sendMessage(user2, "");
//        user2.sendMessage(user1, "");
//        user2.sendMessage(user1, "");
//        user2.sendMessage(user1, "");
//        user3.sendMessage(user1, "");
//        user3.sendMessage(user1, "");
//        user3.sendMessage(user1, "");
//        user1.sendMessage(user3, "");
//        user1.sendMessage(user3, "");
//        user1.sendMessage(user3, "");
//        user3.sendMessage(user1, "");

        MessageDatabase.addNewMessage(user1, user2, "Hi");

        System.out.println(MessageDatabase.getMessages());
        System.out.println(MessageDatabase.getMessagesBad());

    }
}
