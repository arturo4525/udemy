package firststeps;

public class FloatDoublePrimitives {

    public static void main(String[] args) {

        System.out.println("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        System.out.println("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
        /*
        Double can work with more numbers and storage compared to float.
        But it needs twice the amount of memory 64 or 8 bytes.

         */

        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;

        System.out.println("My int value " + myIntValue + " My Float Value " + myFloatValue + " My double is  " + myDoubleValue);
        System.out.println("   " + myIntValue + "   " + myFloatValue + "   " + myDoubleValue);
        System.out.println(" \n " + myIntValue + " \n " + myFloatValue + " \n " + myDoubleValue );

       // float myOtherFloatValue = 5.25; # The double is the default floating point in java.

        float myOtherFloatValue = (float) 5.25; // (float) makes the double to float. It's called casting.
        System.out.println(myOtherFloatValue);


    }
}
