package bridge;

public class Main {

    public static void main(String[] args) {
        var message = new Message(new Korean());
        System.out.println(message.greeting());
        var message2 = new Message(new English());
        System.out.println(message2.greeting());
    }
}
