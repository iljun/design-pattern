package factoryMethod;

public class Main {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        var lgProduct = productFactory.createProduct("lg");
        lgProduct.name();

        var samsungProduct = productFactory.createProduct("samsung");
        samsungProduct.name();
    }
}
