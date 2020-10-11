package abstractFactory.korea;

import abstractFactory.DoorProduct;

public class KoreaDoorProduct implements DoorProduct {

    public KoreaDoorProduct() {
        System.out.println("Korea Door 객체 생성");    
    }
    
    @Override
    public void makeAssemble() {
        System.out.println("Korea Door 장착");
    }
}
