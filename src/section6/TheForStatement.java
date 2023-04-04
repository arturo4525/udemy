package section6;

public class TheForStatement {

    public static void main(String[] args) {

        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5.0));

        // Bolla denna med Julia!

        for (double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("10.000 at " + rate + "% interest = " + interestAmount);
        }

        for(double i = 7.5; i <= 10; i += 0.25){
            double interestAmount = calculateInterest(100, i);
            if(interestAmount > 8.5){
                break;
            }
            System.out.println("100.00 at " + i + "% interest = $" + interestAmount);
        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
