package data;

import enums.GenderEnum;
import enums.MerchandiseTypeEnum;
import model.Merchandise;
import model.Seaman;

import java.util.Arrays;
import java.util.List;

public class MerchandiseDataMock {
    /**
     * getList of seaman
     *
     * @return List of seaman
     */
    public static List<Merchandise> getList(){
        return Arrays.asList(
                new Merchandise("Meats",
                        300,
                        MerchandiseTypeEnum.FOOD
                ),
                new Merchandise("Tools",
                        90,
                        MerchandiseTypeEnum.MATERIAL
                ),
                new Merchandise("Katana",
                        50,
                        MerchandiseTypeEnum.WEAPON
                ),
                new Merchandise("Gold",
                        1000,
                        MerchandiseTypeEnum.FABRIC
                ),
                new Merchandise("turmeric",
                        200,
                        MerchandiseTypeEnum.SPICE
                )
        );
    }

}
