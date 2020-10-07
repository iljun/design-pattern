package simpleFactory;

public class Main {

    public static void main(String[] args) {
        var hello = new Hello();
        System.out.println(hello.greeting("en"));
        System.out.println(hello.greeting("ko"));
    }
}
