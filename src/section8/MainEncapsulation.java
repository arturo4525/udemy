package section8;

public class MainEncapsulation {
    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("current job pages: %d, printer total: %d %n",pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("current job pages: %d, printer total: %d %n",pagesPrinted, printer.getPagesPrinted());

    }
}
