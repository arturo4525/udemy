package section7;

public class Car {

    private String make = "Tesla";
    private String model = "Model Y";
    private String color = "Black";
    private int doors = 5;
    private boolean convertible = true;

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

    public String getMake(){
        return make;
    }

    public void setMake(String make){ // this.make = make; Update this variable here, private String make, with the contents of the parameter make, that was passed to us.
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
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

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color+ " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
