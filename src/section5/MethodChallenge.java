package section5;

public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Anders", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Lina", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Belle", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Lukas", highScorePosition);

        int anotherScorePosition = calculateHighScorePosition(125);
        displayHighScorePosition("Anders", anotherScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " Managed to get into position "
                + highScorePosition +  " on the high score list ");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore >= 1000){
            return 1;

        } else if (playerScore >= 500) {
            return 2;

        } else if (playerScore >= 100) {
            return 3;
        }

        return 4;
        /* Much better way to understand and also to write code so other can read and get better understanding.

        int position = 4;
        if(playerScore >= 1000){
            position 1;

        } else if (playerScore >= 500) {
            position 2;

        } else if (playerScore >= 100) {
            position 3;
        }

        return position;

         */
}

}
