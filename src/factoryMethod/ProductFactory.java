package factoryMethod;

public class ProductFactory extends Factory {

    @Override
    public Product createProduct(String brand) {
        if (brand.equals("lg")) {
            return new LgProduct();
        }

        return new SamsungProduct();
    }
}
