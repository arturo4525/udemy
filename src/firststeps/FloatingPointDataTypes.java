package firststeps;

public class FloatingPointDataTypes {
    public static void main(String[] args) {

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println("\n" + myIntValue + "\n" + myDoubleValue + "\n" + myFloatValue);

        int thisIntValue = 5/2;
        System.out.println(thisIntValue);

        float thisIsMyFloatValue = 5f / 2f;
        System.out.println(thisIsMyFloatValue);

        double thisIsMyDoubleValue = 5d / 2f;
        System.out.println(thisIsMyDoubleValue);

        myIntValue = 5/3;
        System.out.println(myIntValue);

        myFloatValue = 5f / 3f;
        System.out.println(myFloatValue);

        myDoubleValue = 5d / 3d;
        System.out.println(myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println(convertedKilograms);
        System.out.println("My number of converted kilograms is  : " + convertedKilograms);

    }
}
