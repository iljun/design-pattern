package builder;

import builder.computer.Computer;
import builder.computer.ComputerAlgorithm;

public class Main {

    // TODO refactoring 너무 복잡한 Builder 객체를 생성해야한다.
    public static void main(String[] args) {
        Algorithm algorithm = new ComputerAlgorithm();
        Builder builder = new ConcreteBuilder(algorithm);

        Computer computer = builder.build();
        System.out.println(computer);
        System.out.println(String.format("computer memory : %d", computer.memory()));
        System.out.println(String.format("computer storage : %d", computer.storage()));
    }
}
