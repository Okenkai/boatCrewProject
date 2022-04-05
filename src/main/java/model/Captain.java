package model;

import enums.GenderEnum;

public class Captain extends Person {
    private Boat boat;

    public Captain() {
        super();
    }

    public Captain(String name, int age, GenderEnum gender, Boat boat) {
        super(name, age, gender);
        this.boat = boat;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

}
