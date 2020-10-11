package abstractFactory.state;

import abstractFactory.DoorProduct;

public class StateDoorProduct implements DoorProduct {

    public StateDoorProduct() {
        System.out.println("State Door Product 객체 생성");    
    }
    
    @Override
    public void makeAssemble() {
        System.out.println("State Door 장착");
    }
}
