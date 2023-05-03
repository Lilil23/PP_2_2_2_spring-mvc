package web.model;

public class Car {
    private String brend;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String brend, String model, int year) {
        this.brend = brend;
        this.model = model;
        this.year = year;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}