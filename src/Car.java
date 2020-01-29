public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private Double speed;

    public Car() {
        this.make = "Ford";
        this.model = "Mustang";
        this.year = 2019;
        this.color = "red";
        this.speed = 0.0;
    }

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

        this.speed = 0.0;
    }

    public Double getSpeed() {
        return speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(double speed) {
        while (this.speed < speed) {
            //accelerate
            accelerate();
        }

        while (this.speed > speed) {
            //decelerate
            decelerate();
        }
    }

    private void decelerate() {
        this.speed -= 1;
    }

    private void accelerate() {
        this.speed += 1;
    }

    public void stop() {
        this.speed = 0.0;
    }

    public static double convertMphToKmh(double mph) {
        return mph * 1.60934;
    }
}
