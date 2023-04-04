package section5;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 30){
            System.out.println("Invalid Value");
        }else {
            int megaBytes = kiloBytes / 1024;
            int myRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + myRemainder + " KB ");
        }


    }

    public static void main(String[] args) {

        MegaBytesConverter.printMegaBytesAndKiloBytes(0);

    }
}

