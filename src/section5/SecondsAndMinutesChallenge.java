package section5;

public class SecondsAndMinutesChallenge {


    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

    }

    public static String getDurationString(int seconds){

        int minutes = seconds / 60;

        /*
        int hours = minutes / 60;
        System.out.println("Hours = " + hours);

        int hours1 = seconds / 3600;
        System.out.println("hours1 = " + hours1);


        int remainingMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remainingMinutes = " + remainingMinutes);

        int remainingSeconds = seconds % 60;
        System.out.println("remainingSeconds = " + remainingSeconds);

         */

        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds){

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;


        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";


    }


}
