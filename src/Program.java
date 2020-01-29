public class Program {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("myCar Make " + myCar.getMake());
        System.out.println("myCar Model " + myCar.getModel());
        System.out.println("myCar year " + myCar.getYear());
        System.out.println("myCar color " + myCar.getColor());
        System.out.println("myCar Speed " + myCar.getSpeed());

        Car car2 = new Car("Honda", "Accord", 2019, "red");

        System.out.println("myCar Make " + car2.getMake());
        System.out.println("myCar Model " + car2.getModel());
        System.out.println("myCar year " + car2.getYear());
        System.out.println("myCar color " + car2.getColor());
        System.out.println("myCar Speed " + car2.getSpeed());

        car2.move(55);
        System.out.println("myCar Speed " + car2.getSpeed());

        System.out.println("55 mph is " + Car.convertMphToKmh(55) + " Km/h");

    }

}
