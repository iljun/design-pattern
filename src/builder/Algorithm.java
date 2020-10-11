package builder;

import builder.computer.Computer;

import java.util.List;

public abstract class Algorithm {

    protected Computer composite;

    public abstract void setCpu(String name);

    public abstract void setRams(List<Integer> rams);

    public abstract void setStorages(List<Integer> storages);

    public Computer getInstance() {
        return this.composite;
    }
}
