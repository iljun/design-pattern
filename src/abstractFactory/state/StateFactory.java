package abstractFactory.state;

import abstractFactory.DoorProduct;
import abstractFactory.Factory;
import abstractFactory.TireProduct;

public class StateFactory extends Factory {

    public StateFactory() {
        System.out.println("미국 공장 객체 생성");
    }
    
    @Override
    public TireProduct createTire() {
        return new StateTireProduct();
    }

    @Override
    public DoorProduct createDoor() {
        return new StateDoorProduct();
    }
}
