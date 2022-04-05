package data;

import enums.GenderEnum;
import model.Person;

public class PersonDataMock {
    /**
     * Get shopkeeper
     *
     * @return shopkeeper
     */
    static Person getShopkeeper(){
        Person shopkeeper = new Person();
        shopkeeper.setName("Eiichiro Oda");
        shopkeeper.setAge(47);
        shopkeeper.setGender(GenderEnum.MALE);

        return shopkeeper;
    }

    /**
     * Get farmer
     *
     * @return farmer
     */
    static Person getFarmer(){
        Person farmer = new Person();
        farmer.setName("River Arnaud");
        farmer.setAge(29);
        farmer.setGender(GenderEnum.MALE);

        return farmer;
    }

}
