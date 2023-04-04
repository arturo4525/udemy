package firststeps;

public class Primitive {
    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        System.out.println("Byte value is " +  byteValue + " short value is " + shortValue + " Int value is " + intValue);

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue); // Parentheses are another way to make the code more readable.
                                                                                // Parentheses make it clear also which calculation should be done first.
        System.out.println(longTotal);

        int sumOfThree = byteValue + shortValue + intValue;
        System.out.println(sumOfThree);

        longTotal = 50000L + (10 *  sumOfThree);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);



    }
}
