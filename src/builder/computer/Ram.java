package builder.computer;

public class Ram {
    private int size;

    public Ram(int size) {
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return String.format("Ram size : %d", this.size);
    }
}
