package section5;

public class StatementsWhitespaceIndentation {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--; // The semicolon makes it a statement.

        System.out.println("This is a test");

        System.out.println("This is" +
                "another" +
                "still more.");

        int anotherVariable = 50;
        myVariable --;
        System.out.println("myVariable = " + myVariable);// never write several blocks of code / statements in one line, since it need to be readable and easy to understand to whomever.

        if (myVariable == 0) {
            System.out.println("It is now zero");
        }
    }
}
