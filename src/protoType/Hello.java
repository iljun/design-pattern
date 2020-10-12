package protoType;

public class Hello implements Cloneable {
    private String message;

    public Hello(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Hello(this.message);
    }
}
