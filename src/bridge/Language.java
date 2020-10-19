package bridge;

public abstract class Language {
    private Hello hello;

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public abstract String greeting();
}
