package builder;

import builder.computer.Computer;

import java.util.Arrays;

public class ConcreteBuilder extends Builder {

    public ConcreteBuilder(Algorithm algorithm) {
        super(algorithm);
        System.out.println("Concrete Builder 객체 생성");
    }

    @Override
    public Computer build() {
        System.out.println("객체 생성");
        this.algorithm.setCpu("i7");
        this.algorithm.setRams(Arrays.asList(4, 4));
        this.algorithm.setStorages(Arrays.asList(256, 256));

        return this.algorithm.composite;
    }
}
