package builder.computer;

import builder.Algorithm;

import java.util.List;
import java.util.stream.Collectors;

public class ComputerAlgorithm extends Algorithm {
    
    public ComputerAlgorithm() {
        System.out.println("ProductModel 객체 생성");
        super.composite = new Computer();
    }

    @Override
    public void setCpu(String name) {
        this.composite.cpu = new CPU(name);
    }

    @Override
    public void setRams(List<Integer> rams) {
        this.composite.rams = rams
                .stream()
                .map(Ram::new)
                .collect(Collectors.toList());
    }

    @Override
    public void setStorages(List<Integer> storages) {
        this.composite.storages = storages
                .stream()
                .map(Storage::new)
                .collect(Collectors.toList());
    }

    @Override
    public Computer getInstance() {
        return super.getInstance();
    }
}
