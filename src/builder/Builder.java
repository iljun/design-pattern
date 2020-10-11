package builder;

import builder.computer.Computer;

public abstract class Builder {
    protected Algorithm algorithm;

    public Builder(Algorithm algorithm) {
        System.out.println("빌드 알고리즘 저장");
        this.algorithm = algorithm;
    }

    public abstract Computer build();
}
