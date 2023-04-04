package section11;

public class Dog extends Mammal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " lazily swimming");
        }else {
            System.out.println(getExplicitType() + " darting frantically");
        }



    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf"){
            System.out.println("howling");

        }else {
            System.out.println("woof!");
        }

    }

}
