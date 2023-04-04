package section11;

public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " walking");
        }else {
            System.out.println(getExplicitType() + " running");
        }



    }

    @Override
    public void makeNoise() {

        if(type == "Shark"){
            System.out.println("Attack");

        }else {
            System.out.println("Splash");
        }

    }

}
