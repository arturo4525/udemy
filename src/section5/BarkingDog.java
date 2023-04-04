package section5;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay >= 0 && hourOfDay < 8) {
            return true;
        } else if (barking && hourOfDay > 22 && hourOfDay <= 23) {
            return true;
        } else {
            return false;
        }
    }

}
