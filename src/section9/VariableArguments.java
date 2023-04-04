package section9;

public class VariableArguments {
    public static void main(String... args) {
        System.out.println("Hello World!");

        String[] splitStrings = "Hello World again".split(" ");

        //String[] splitStrings2 = "Vad jag än skriver ut from nu kommer denna att printa ut på varje ord på ny rad".split(" ");

        printText(splitStrings); // Strängen blir delad i olika delar och returnerar en array av typen String. Den returnerar 3st String i en array i separata delar/kodrader.
        System.out.println("_".repeat(20));
        printText("Hello!");
        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        String[] sArray = {"first", "second","third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));



        //printText(splitStrings2);
    }
    private static void printText(String... textList){
        for (String t : textList){
            System.out.println(t);
        }
    }
}
