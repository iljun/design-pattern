package abstractFactory.korea;

import abstractFactory.DoorProduct;
import abstractFactory.Factory;
import abstractFactory.TireProduct;

public class KoreaFactory extends Factory {

    public KoreaFactory() {
        System.out.println("한국 공장 객체 생성");
    }
    
    @Override
    public TireProduct createTire() {
        return new KoreaTireProduct();
    }

    @Override
    public DoorProduct createDoor() {
        return new KoreaDoorProduct();
    }
}
