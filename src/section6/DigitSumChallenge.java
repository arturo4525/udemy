package section6;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigit(10));


    }

    public static int sumDigit (int number){
        int sum = 0;
        if(number < 0){
            return -1;
        }
        while(number !=0){
            sum += number%10;
            number = (number - (number%10))/10;
        }
        return sum;
    }



}
