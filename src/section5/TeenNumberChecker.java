package section5;

public class TeenNumberChecker {



    public static boolean isTeen(int numberOne){
        return numberOne >= 13 && numberOne <= 19;
    }

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree){
        return (isTeen(numberOne)|| isTeen(numberTwo)|| isTeen(numberThree));
    }
}
