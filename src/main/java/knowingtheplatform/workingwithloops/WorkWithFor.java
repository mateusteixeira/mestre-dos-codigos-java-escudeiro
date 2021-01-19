package knowingtheplatform.workingwithloops;

public class WorkWithFor {

    public static void main(String[] args) {
        int[] arrayOfInt = new int[10];

        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = i * 2;
        }

        System.out.println("All array's positions initialized in a for, in witch the index was multiplied by 2");

        for (int intFromArray : arrayOfInt) {
            System.out.print(intFromArray + " ");
        }
    }
}
