package data;

import model.Boat;
import model.ViceCaptain;

import java.util.Arrays;
import java.util.List;

public class BoatDataMock {
    static Boat getStrawHatsBoat(){
        Boat strawHatsBoat = new Boat();
        strawHatsBoat.setName("Thousand Sunny");
        strawHatsBoat.setModel("Caravel");
        strawHatsBoat.setMerchandises(MerchandiseDataMock.getList());

        return strawHatsBoat;
    }
    static Boat getHeartsBoat(){
        Boat heartsBoat = new Boat();
        heartsBoat.setName("Polar Tang");
        heartsBoat.setModel("submarine");
        heartsBoat.setMerchandises(MerchandiseDataMock.getList());

        return heartsBoat;
    }

    public static List<Boat> getList() {
        return Arrays.asList(
                getHeartsBoat(),
                getStrawHatsBoat()
        );
    }
}
