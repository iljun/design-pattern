package builder.computer;

public class Storage {
    private int size;

    public Storage(int size) {
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return String.format("Storage size : %d", this.size);
    }
}
