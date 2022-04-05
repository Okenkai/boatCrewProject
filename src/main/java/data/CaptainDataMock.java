package data;

import enums.GenderEnum;
import model.Boat;
import model.Captain;

import java.util.Arrays;
import java.util.List;

public class CaptainDataMock {
    static Captain getStrawHatsCaptain(){
        Captain strawHatsCaptain = new Captain();
        strawHatsCaptain.setName("Monkey D Luffy");
        strawHatsCaptain.setAge(19);
        strawHatsCaptain.setGender(GenderEnum.MALE);
        strawHatsCaptain.setBoat(BoatDataMock.getStrawHatsBoat());

        return strawHatsCaptain;
    }

    static Captain getHeartsCaptain(){
        Captain heartsCaptain = new Captain();
        heartsCaptain.setName("Trafalgar D Water Law");
        heartsCaptain.setAge(28);
        heartsCaptain.setGender(GenderEnum.MALE);
        heartsCaptain.setBoat(BoatDataMock.getHeartsBoat());

        return heartsCaptain;
    }

    public static List<Captain> getList() {
        return Arrays.asList(
                getHeartsCaptain(),
                getStrawHatsCaptain(),
                new Captain("Baggy the clown", 44, GenderEnum.MALE, BoatDataMock.getStrawHatsBoat())
        );
    }
}
