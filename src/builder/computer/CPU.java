package builder.computer;

public class CPU {
    private String name;

    public CPU(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("CPU : %s", name);
    }
}
