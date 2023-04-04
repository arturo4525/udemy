package intellij;

public class OperatorPrecedenceAndOperatorChallenge {

    public static void main(String[] args) {

        double firstValue = 20.00;
        double secondValue = 80.00;
        double myResult = firstValue + secondValue;
        System.out.println("This was my result = " + myResult * 100.00);

        double firstResult = 10000.0;
        double secondResult = 40.000;

        double k = firstResult % secondResult;
        System.out.println(k);

        boolean isItTrue = true;
        boolean itIsNotTrue = false;
        if (isItTrue== true){
            System.out.println("This was indeed true");
        } else if (itIsNotTrue == false) {
            System.out.println("you've got some reminder to do");

        }


    }
}
