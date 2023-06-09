package section7;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = "  + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982"; // Java recognizes this declaration is a string due to literals ("" or /) and + operator.
        System.out.println("newDate = "  + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("19982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-')); // Nice.
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-")); // Byter enbart ut första när den är true
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));
        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
