package protoType;

public class Main {

    public static void main(String[] args) {
        Hello hello1 = new Hello("hello");
        try {
            Hello hello2 = (Hello) hello1.clone();
            System.out.println(hello1 == hello2);
            hello1.setMessage("change");
            System.out.println(hello1.getMessage().equals(hello1.getMessage()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
