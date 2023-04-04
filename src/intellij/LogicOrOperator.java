package intellij;

public class LogicOrOperator {

    public static void main(String[] args) {
        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        boolean argentinaBest = true;
        if(argentinaBest == true) {
            System.out.println("Argentina won the world cup 2022");

        } else if (argentinaBest == false ) {

            System.out.println("They did not win!");

        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
