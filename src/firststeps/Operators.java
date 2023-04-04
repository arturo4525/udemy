package firststeps;

public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2; // There is two operators here, = and +.
        System.out.println(result);

        int result2 = 3 - 1;
        System.out.println(result2);

        int previousResult = result;

        result = result - 1;
        System.out.println(result);

        System.out.println(previousResult);

        char firstChar = 'A';
        char secondChar = 'B';

        System.out.println(firstChar + secondChar);
        System.out.println("" + firstChar + secondChar); // The "" makes it an empty string and converts the line to a string.

        result = 2;

        System.out.println(result * 10);





    }
}

