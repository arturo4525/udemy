package intellij;

public class AssignmentOperatorVSEqualsToOperatorChallenge {

    public static void main(String[] args) {

        int newValue = 50;
        if (newValue == 50){ // Needs to be two == operators to be able to run.
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){ // Using one = operator prints it out but does not compare the if statement. To compare use 2 == assignment operators.
            System.out.println("This is not supposed to happen");
        }

    }
}
