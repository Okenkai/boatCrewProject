package data;

import enums.GenderEnum;
import model.Captain;
import model.Seaman;

import java.util.Arrays;
import java.util.List;

public class SeamanDataMock {

    /**
     * getList of seaman
     *
     * @return List of seaman
     */
    public static List<Seaman> getList(){
        return Arrays.asList(
                new Seaman("Brook the hummer",
                            90,
                            GenderEnum.MALE,
                            CaptainDataMock.getStrawHatsCaptain(),
                            ViceCaptainDataMock.getStrawHatsViceCaptain(),
                            BoatDataMock.getStrawHatsBoat()
                            ),
                new Seaman("Jimbei the seas paladin",
                        46,
                        GenderEnum.MALE,
                        CaptainDataMock.getStrawHatsCaptain(),
                        ViceCaptainDataMock.getStrawHatsViceCaptain(),
                        BoatDataMock.getStrawHatsBoat()
                ),
                new Seaman("Nami Cat Burglar",
                        20,
                        GenderEnum.FEMALE,
                        CaptainDataMock.getStrawHatsCaptain(),
                        ViceCaptainDataMock.getStrawHatsViceCaptain(),
                        BoatDataMock.getStrawHatsBoat()
                ),
                new Seaman("Sanji the black leg",
                        21,
                        GenderEnum.MALE,
                        CaptainDataMock.getStrawHatsCaptain(),
                        ViceCaptainDataMock.getStrawHatsViceCaptain(),
                        BoatDataMock.getStrawHatsBoat()
                ),
                new Seaman("Jean Bart",
                        38,
                        GenderEnum.MALE,
                        CaptainDataMock.getHeartsCaptain(),
                        ViceCaptainDataMock.getHeartsViceCaptain(),
                        BoatDataMock.getHeartsBoat()
                ),
                new Seaman("Morge",
                        33,
                        GenderEnum.MALE,
                        CaptainDataMock.getList().get(2),
                        ViceCaptainDataMock.getHeartsViceCaptain(),
                        BoatDataMock.getHeartsBoat()
                )
        );
    }

}
