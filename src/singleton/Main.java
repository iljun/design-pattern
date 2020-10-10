package singleton;

public class Main {

    public static void main(String[] args) {
        Config config1 = Config.getInstance();
        Config config2 = Config.getInstance();
        System.out.println(config1 == config2);
    }
}
