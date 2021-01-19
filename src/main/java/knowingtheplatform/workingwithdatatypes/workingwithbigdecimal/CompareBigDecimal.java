package knowingtheplatform.workingwithdatatypes.workingwithbigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class CompareBigDecimal {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("enter a number");
            BigDecimal firstBigDecimal = keyboard.nextBigDecimal();

            System.out.println("enter another number");
            BigDecimal secondBigDecimal = keyboard.nextBigDecimal();

            if (firstBigDecimal.compareTo(secondBigDecimal) == 0) {
                System.out.println("BigDecimal values are equals");
            } else if (firstBigDecimal.compareTo(secondBigDecimal) > 0) {
                System.out.println("BigDecimal value " + firstBigDecimal + " is greater than " + secondBigDecimal);
            } else {
                System.out.println("BigDecimal value " + firstBigDecimal + " is less than " + secondBigDecimal);
            }

            if (firstBigDecimal.equals(secondBigDecimal)) {
                System.out.println("Using equals method works too, but if and only if values and scales are equals");
            } else {
                System.out.println("Not equals by value or scale");
            }
        }
    }


}
