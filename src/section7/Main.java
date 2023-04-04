package section7;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("BMW");
        car.setModel("530M");
        car.setDoors(5);
        car.setConvertible(true);
        car.setColor("Black");



        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car bmw = new Car();
        bmw.setMake("Bmw");
        bmw.setColor("Silver");
        bmw.setDoors(2);
        bmw.setConvertible(false);

        bmw.describeCar();

    }


}
