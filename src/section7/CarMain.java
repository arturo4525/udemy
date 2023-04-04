package section7;

public class CarMain {
    public static void main(String[] args) {
        CarCopy myCar = new CarCopy();
        CarCopy yourCar = new CarCopy();

        CarCopy wifesCar = new CarCopy("Porsche","Ceed","Black",5,false);

        myCar.setColor("Black");
        myCar.setModel("V70");
       // myCar.describeCar();
        myCar.setColor("Green");
        myCar.describeCar();

        yourCar.setModel("Focus");
        yourCar.setColor("Red");
        yourCar.describeCar();
        myCar.describeCar();

        wifesCar.describeCar();
        wifesCar.setMake("Tesla");
        System.out.println(wifesCar.getDoors());
        System.out.println(wifesCar.getMakeAndModel());

    }
}
