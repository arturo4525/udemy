package intellij;

public class ChallengeSolution {

    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double myValuesTotal = (firstValue + secondValue) * 100;
        System.out.println("This was my result = " + myValuesTotal);

        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder ==0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }

    }
}
