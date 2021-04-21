package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String user;
    List<User> subscriptions;

    public User(String user) {
        this.user = user;
        this.subscriptions = new ArrayList<>();
    }

    public String getUser() {
        return user;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User userToSubscribe) {
        subscriptions.add(userToSubscribe);
    }

    public boolean isSubscribed(User userForComparison) {
        if (subscriptions.contains(userForComparison)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFriend(User userForComparison) {
        if (userForComparison.isSubscribed(this) && isSubscribed(userForComparison)) {
            return true;
        } else {
            return false;
        }
    }

    public void sendMessage(User receiver, String text) {
        MessageDatabase.addNewMessage(this, receiver, text);
    }

    @Override
    public String toString() {
        return user;
    }
}
