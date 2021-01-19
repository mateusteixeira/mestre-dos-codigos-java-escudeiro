package knowingtheplatform.workingwithdatatypes.wrappersanddefaultvalues;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExamples {

    public static void main(String[] args) {

        Long l = 2L;
        Long aLong = Long.valueOf("3");

        AutoboxingUnboxingExamples autoboxingUnboxingExamples = new AutoboxingUnboxingExamples();

        List<Integer> integers = autoboxingUnboxingExamples.autoBoxingNumbers();
        System.out.println(integers);
        int sumNumbers = autoboxingUnboxingExamples.unBoxingNumbers(integers);
        System.out.println("\n"+sumNumbers);
    }

    private List<Integer> autoBoxingNumbers() {
        List<Integer> autoboxNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            autoboxNumbers.add(i);
        }
        return autoboxNumbers;
    }

    private int unBoxingNumbers(List<Integer> numberToSum) {
        int sum = 0;
        for (Integer number : numberToSum) {
            sum += number;
        }
        return  sum;
    }

}
