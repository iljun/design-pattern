package singleton;

import java.util.Objects;

public class Config implements Cloneable {
    private static Config instance;

    private Config() {

    }

    public synchronized static Config getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Config();
        }
        return instance;
    }

    @Override
    protected Object clone() {
        return this;
    }
}
