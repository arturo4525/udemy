package section6;

public class ParsingAndReadingInput {

    public static void main(String[] args) {

        int currentYear = 2022;
        try{

            System.out.println(getInputFromUserConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner((currentYear)));
        }
    }

    public static String getInputFromUserConsole(int currentYear){

        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + "years old";
    }
    public static String getInputFromScanner (int currentYear){

        return "";

    }
}
