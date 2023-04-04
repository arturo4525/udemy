package section9;
import java.util.Arrays;
import java.util.Random;
public class ArrayChallenge {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

    }

    public static int[] getRandomArray(int len){

        Random random = new Random();
        int[] randomArray = new int[len];

        for(int i = 0; i < len; i++){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
}
