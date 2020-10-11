package builder.computer;

import java.util.List;

public class Computer {
    public CPU cpu;
    public List<Ram> rams;
    public List<Storage> storages;

    protected Computer() {
        System.out.println("Computer 객체 생성");
    }

    @Override
    public String toString() {
        return String.format("CPU : %s, \n" +
                "RAM : %s, \n" +
                "Storage : %s", this.cpu, this.rams, this.storages);
    }

    public int memory() {
        return this.rams.stream()
                .mapToInt(ram -> ram.size())
                .sum();

    }

    public int storage() {
        return this.storages.stream()
                .mapToInt(storage -> storage.size())
                .sum();
    }
}
