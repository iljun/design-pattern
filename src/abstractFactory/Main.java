package abstractFactory;

import abstractFactory.korea.KoreaFactory;
import abstractFactory.state.StateFactory;

public class Main {

    public static void main(String[] args) {
        var koreaFactory = new KoreaFactory();
        var koreaDoor = koreaFactory.createDoor();
        koreaDoor.makeAssemble();
        var koreaTire = koreaFactory.createTire();
        koreaTire.makeAssemble();

        var stateFactory = new StateFactory();
        var stateDoor = stateFactory.createDoor();
        stateDoor.makeAssemble();
        var stateTire = stateFactory.createTire();
        stateTire.makeAssemble();
    }
}
