package section9;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(java.util.Arrays.toString(firstArray));
        java.util.Arrays.sort(firstArray);
        System.out.println(java.util.Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(java.util.Arrays.toString(secondArray));
        java.util.Arrays.fill(secondArray, 5);
        System.out.println(java.util.Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(java.util.Arrays.toString(thirdArray));

        int[] fourthArray = java.util.Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(java.util.Arrays.toString(fourthArray));

        java.util.Arrays.sort(fourthArray);
        System.out.println(java.util.Arrays.toString(thirdArray));
        System.out.println(java.util.Arrays.toString(fourthArray));

        int[] smallerArray = java.util.Arrays.copyOf(thirdArray,5);
        System.out.println(java.util.Arrays.toString(smallerArray));

        int[] largerArray = java.util.Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray); // MÅSTE SORTERAS INNAN MAN SÖKER!!!!!!!!! Tänk gulasidorna eller hitta.
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark in the list!");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5,0}; // Ta bort nollan så kollar den om de samma, vid ja så kör man på nytt.
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
