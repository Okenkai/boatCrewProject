package model;
import enums.MerchandiseTypeEnum;

public class Merchandise {
    private String name;
    private int weight;
    private MerchandiseTypeEnum type;

    public Merchandise(String name, int weight, MerchandiseTypeEnum type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public MerchandiseTypeEnum getType() {
        return type;
    }

    public void setType(MerchandiseTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Merchandise{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
