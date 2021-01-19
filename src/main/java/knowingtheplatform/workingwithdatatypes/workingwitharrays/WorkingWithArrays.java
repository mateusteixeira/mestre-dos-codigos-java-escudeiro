package knowingtheplatform.workingwithdatatypes.workingwitharrays;

public class WorkingWithArrays {

    public static void main(String[] args) {

        //Declaring a array
        int[] arrayOfInt = new int[10];
        System.out.println("Array with size: " +arrayOfInt.length);
        System.out.println("All positions with default value (0) for primitive int: ");
        for(int i = 0; i < arrayOfInt.length; i++) {
            System.out.print(arrayOfInt[i] + " ");
        }
        System.out.println();

        Long[] arrayOfWrapperLong = new Long[5];
        System.out.println("Array of Long wrapper with size: " +arrayOfWrapperLong.length);
        System.out.println("All positions with default value (null) for wrapper long: ");
        for(int i = 0; i < arrayOfWrapperLong.length; i++) {
            System.out.print(arrayOfWrapperLong[i] + " ");
        }
        System.out.println();

        int[] anotherArrayOfIntWithInitialization = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Array with size: " +anotherArrayOfIntWithInitialization.length);
        System.out.println("All positions filled with values in initialization: ");
        for(int i = 0; i < anotherArrayOfIntWithInitialization.length; i++) {
            System.out.print(anotherArrayOfIntWithInitialization[i] + " ");
        }
        System.out.println();


        for(int i = 0; i < arrayOfWrapperLong.length; i++) {
            arrayOfWrapperLong[i] = Long.valueOf(i+1);
        }
        System.out.println("All positions filled with values in a for loop enhanced: ");
        for (Long aLong : arrayOfWrapperLong) {
            System.out.print(aLong + " ");
        }

    }

}
