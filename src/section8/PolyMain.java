package section8;

public class PolyMain {

    public static void main(String[] args) {

        Car car = new Car("2023 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2023 Blue Ferrari 296 GTS", 15.4,6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2023 Red Tesla Model 3",
                15.4,75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2023 Black Ferrari SF90 Stradale", 16,8,8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
