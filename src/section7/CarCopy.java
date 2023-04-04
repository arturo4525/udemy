package section7;

public class CarCopy {
    // Blueprint to manufacture the car.
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    // This is what's needed to build the car. This is needed to prevent at car from being built without the necessary parts.
    public CarCopy(String brand, String model, String color, int numberOfDoors, boolean convertible) {
        this.make = brand; // Here start's the manufacturing of the car.
        this.model = model;
        this.color = color;
        this.doors = numberOfDoors;
        this.convertible = convertible; // Here ends the manufacturing of the car.
    }
// Default constructor, if there is no other constructor specified then this is implicit.
    public CarCopy() {
     }

    public String getMakeAndModel(){
        return make + " " + model;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) { // this.make = make; Update this variable here, private String make, with the contents of the parameter make, that was passed to us.
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported ";
            }
        }

    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "- Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}


