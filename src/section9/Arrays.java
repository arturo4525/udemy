package section9;

public class Arrays {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        newArray = new int[]{5,4,3,2,1};
        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i] + " ");
        }
        int[] andersArray;
        andersArray = new int[]{7,6,5,4,3,2,1};
        for (int i = 0; i < andersArray.length; i++){
            System.out.println("Den går neråt " + andersArray[i] + " ");
        }

        int[] testArray;
        testArray = new int[]{10,9,8,7};
        for (int i = 0; i < testArray.length; i++){
            System.out.println("Tickar neråt " + testArray[i] + " ");
        }



    }

}
