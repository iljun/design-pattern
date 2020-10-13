package adapter;

public class Main {

    public static void main(String[] args) {
        Adapter adapter = new IntMath();
        System.out.println(adapter.twiceOf(5));
        System.out.println(adapter.halfOf(4));
    }
}
