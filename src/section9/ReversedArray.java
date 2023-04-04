package section9;
import java.util.Scanner;
import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();

        // Create an array of the specified length
        int[] arr = new int[length];

        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }

        // Reverse the array
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print the reversed array
        System.out.print("The reversed array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
