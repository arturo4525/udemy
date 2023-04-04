package section6;

public class WhileLoopChallenge {

    public static void main(String[] args) {

        int evenNumber = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (evenNumber <= finishNumber){
            evenNumber++;
            if(!isEvenNumber(evenNumber)){
                System.out.println("Odd number " + evenNumber);
                oddCount ++;
                continue;
            }
            //System.out.println("Even number = " + evenNumber);
            evenCount ++;
            if(evenCount >= 5){
                break;
            }
        }

        System.out.println("Total amount of odd numbers found = " + oddCount);
        System.out.println("Total amount of even numbers fount = " + evenCount);

    }

    public static boolean isEvenNumber(int evenNumber){

        if ((evenNumber % 2) ==0){
            return true;

        }else {
            return false;
        }
    }
}
