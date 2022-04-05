package model;

import enums.GenderEnum;

public class Seaman extends Person{

    private Captain captain;
    private ViceCaptain viceCaptain;
    private Boat boat;

    public Seaman (){}

    public Seaman(String name, int age, GenderEnum gender, Captain captain, ViceCaptain viceCaptain, Boat boat) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.captain = captain;
        this.viceCaptain = viceCaptain;
        this.boat = boat;
    }

    public ViceCaptain getViceCaptain() {
        return viceCaptain;
    }

    public void setViceCaptain(ViceCaptain viceCaptain) {
        this.viceCaptain = viceCaptain;
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
        return "Seaman{" +
                "person{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                '}'+
                "captain=" + captain +
                ", Vice-captain=" + viceCaptain +
                ", boat=" + boat +
                '}';
    }
}
