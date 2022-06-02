package web;

public class Car {
    private String model;
    private int regions;
    private String number;

    public Car(String model, int regions, String number) {
        this.model = model;
        this.regions = regions;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegions() {
        return regions;
    }

    public void setRegions(int regions) {
        this.regions = regions;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", regions=" + regions +
                ", number=" + number +
                '}';
    }
}
