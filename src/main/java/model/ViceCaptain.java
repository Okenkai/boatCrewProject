package model;

import enums.GenderEnum;

public class ViceCaptain extends Person{
    private Captain captain;
    private Boat boat;

    public ViceCaptain() {}

    public ViceCaptain(String name, int age, GenderEnum gender, Captain captain, Boat boat) {
        super(name, age, gender);
        this.captain = captain;
        this.boat = boat;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "ViceCaptain{" +
                "person{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                '}'+
                "captain=" + captain +
                ", boat=" + boat +
                '}';
    }
}
