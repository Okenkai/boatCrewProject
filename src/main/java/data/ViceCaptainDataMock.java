package data;

import enums.GenderEnum;
import model.ViceCaptain;

import java.util.Arrays;
import java.util.List;

public class ViceCaptainDataMock {
    static ViceCaptain getStrawHatsViceCaptain(){
        ViceCaptain strawHatsViceCaptain = new ViceCaptain();
        strawHatsViceCaptain.setName("Zorro the bounty hunter");
        strawHatsViceCaptain.setAge(23);
        strawHatsViceCaptain.setGender(GenderEnum.MALE);
        strawHatsViceCaptain.setCaptain(CaptainDataMock.getStrawHatsCaptain());
        strawHatsViceCaptain.setBoat(BoatDataMock.getStrawHatsBoat());

        return strawHatsViceCaptain;
    }

    static ViceCaptain getHeartsViceCaptain(){
        ViceCaptain HeartsViceCaptain = new ViceCaptain();
        HeartsViceCaptain.setName("Bepo");
        HeartsViceCaptain.setAge(22);
        HeartsViceCaptain.setGender(GenderEnum.MALE);
        HeartsViceCaptain.setCaptain(CaptainDataMock.getHeartsCaptain());
        HeartsViceCaptain.setBoat(BoatDataMock.getHeartsBoat());

        return HeartsViceCaptain;
    }

    public static List<ViceCaptain> getList() {
        return Arrays.asList(
                getStrawHatsViceCaptain(),
                getHeartsViceCaptain()
        );
    }
}
