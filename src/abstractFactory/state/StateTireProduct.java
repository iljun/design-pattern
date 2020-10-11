package abstractFactory.state;

import abstractFactory.TireProduct;

public class StateTireProduct implements TireProduct {
    
    public StateTireProduct() {
        System.out.println("State Tire Product 객체 생성");
    }

    @Override
    public void makeAssemble() {
        System.out.println("State Tire Product 장착");
    }
}
