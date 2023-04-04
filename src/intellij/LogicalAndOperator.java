package intellij;

public class LogicalAndOperator {

    public static void main(String[] args) {
        System.out.println("Hej Anders");

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And im scared of aliens!");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        boolean argentinaBest = false;
        if(argentinaBest == true) {
            System.out.println("Argentina won the world cup 2022");

        } else if (argentinaBest == false ) {

            System.out.println("They did not win!");

        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore <100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

    }
}
