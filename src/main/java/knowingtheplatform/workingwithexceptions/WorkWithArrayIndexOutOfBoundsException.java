package knowingtheplatform.workingwithexceptions;

public class WorkWithArrayIndexOutOfBoundsException {

    private static int[] array = new int[10];

    protected static int getByIndex(int index) {
        return array[index];
    }

}
