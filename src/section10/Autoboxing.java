package section10;

public class Autoboxing {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); // Preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // Deprecated since jdk 9
        int unboxedInt = boxedInt.intValue(); //Unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName);

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();
    }

    private static  Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
