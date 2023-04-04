package section9;
import java.util.Arrays;
import java.util.Random;
public class ArrayChallenge2 {

    public static void main(String[] args) {

            int[] array = new int[10]; // create an array of 10 integers
            Random random = new Random(); // create a random number generator

            // fill the array with random integers
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100); // generate a random integer between 0 and 99
            }

            System.out.println("Original array: " + Arrays.toString(array));

            // sort the array in descending order
            Arrays.sort(array);
            int[] reversed = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversed[i] = array[array.length - 1 - i];
            }

            System.out.println("Sorted array: " + Arrays.toString(reversed));
        }

}
