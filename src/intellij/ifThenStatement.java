package intellij;

public class ifThenStatement {
    public static void main(String[] args) {

        System.out.println("Test");

        boolean isAlien = false;
        if(isAlien == false) { // Sätt aldrig ett semicolon för att koden tar slut där och java tar inte hänsyn till true eller false statement.
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
    }
}
