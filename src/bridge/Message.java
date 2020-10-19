package bridge;

public class Message extends Language {
    private Hello hello;

    public Message(Hello hello) {
        this.hello = hello;
    }

    @Override
    public String greeting() {
        return this.hello.greeting();
    }
}
