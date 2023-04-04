package section5;

public class IfThenElseChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);

        }

       /* boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = newScore;

        if (newGameOver == true){
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your final score was = " + newFinalScore);

        } */

        gameOver = true; // Without declaring them as new variables, code is runnable and uses the memory more efficiently.
        score = 10000;  // However by doing this ur re-using code, if u need to change in one section. ALl codeblocks must be changed using the duplicated code.
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);

        }

    }
}
