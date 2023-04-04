package intellij;
import java.util.Scanner;


public class UserInput {

    public static void main(String[] args) {

        System.out.println(" *** World Cup 2022 *** ");
        System.out.println("\n");

        Scanner myQuestion = new Scanner(System.in);
        System.out.println("Where was the world cup tournament played ?");
        String userAnswer = myQuestion.nextLine();
        System.out.println("Your Answer is  = " + userAnswer);
        Scanner myQuestion2 = new Scanner(System.in);
        System.out.println("Was it Argentina or France ?");
        String userAnswers2 = myQuestion.nextLine();

        System.out.println("Your answer is " +  userAnswers2);





    }
}
