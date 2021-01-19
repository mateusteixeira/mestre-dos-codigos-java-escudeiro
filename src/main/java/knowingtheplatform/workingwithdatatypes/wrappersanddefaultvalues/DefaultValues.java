package knowingtheplatform.workingwithdatatypes.wrappersanddefaultvalues;

public class DefaultValues {

    private static boolean aBoolean;
    private static byte aByte;
    private static char aChar;
    private static double aDouble;
    private static float aFloat;
    private static int aInt;
    private static long aLong;
    private static short aShort;

    private static Boolean aWrapperBoolean;
    private static Byte aWrapperByte;
    private static Character aWrapperCharacter;
    private static Double aWrapperDouble;
    private static Float aWrapperFloat;
    private static Integer aWrapperInt;
    private static Long aWrapperLong;
    private static Short aWrapperShort;

    public static void main(String[] args) {
        System.out.println("default boolean value: " + aBoolean);
        System.out.println("default byte value:    " + aByte);
        System.out.println("default char value:    " + aChar);
        System.out.println("default double value:  " + aDouble);
        System.out.println("default float value:   " + aFloat);
        System.out.println("default int value:     " + aInt);
        System.out.println("default long value:    " + aLong);
        System.out.println("default short value:   " + aShort);
        System.out.println();
        System.out.println("default boolean wrapper value: " + aWrapperBoolean);
        System.out.println("default byte wrapper value:    " + aWrapperByte);
        System.out.println("default char wrapper value:    " + aWrapperCharacter);
        System.out.println("default double wrapper value:  " + aWrapperDouble);
        System.out.println("default float wrapper value:   " + aWrapperFloat);
        System.out.println("default int wrapper value:     " + aWrapperInt);
        System.out.println("default long wrapper value:    " + aWrapperLong);
        System.out.println("default short wrapper value:   " + aWrapperShort);
    }
}
