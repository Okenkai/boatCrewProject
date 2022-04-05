package model;

import java.util.List;

public class Boat {
    private String name;
    private String model;
    List<Merchandise> merchandises;

    public Boat(){}

    public Boat(String name, String model, List<Merchandise> merchandises) {
        this.name = name;
        this.model = model;
        this.merchandises = merchandises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Merchandise> getMerchandises() {
        return merchandises;
    }

    public void setMerchandises(List<Merchandise> merchandises) {
        this.merchandises = merchandises;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", merchandises=" + merchandises +
                '}';
    }
}
