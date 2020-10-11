package abstractFactory.korea;

import abstractFactory.TireProduct;

public class KoreaTireProduct implements TireProduct {
    
    public KoreaTireProduct() {
        System.out.println("Korea Tire 객체 생성");
    }

    @Override
    public void makeAssemble() {
        System.out.println("Korea Tire 장착");
    }
}
