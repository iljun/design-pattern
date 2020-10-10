package factoryMethod;

public abstract class Factory {

    public final Product getInstance(String brand) {
        return this.createProduct(brand);
    }

    public abstract Product createProduct(String brand);
}
