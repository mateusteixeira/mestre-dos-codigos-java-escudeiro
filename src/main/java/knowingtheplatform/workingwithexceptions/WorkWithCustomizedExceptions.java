package knowingtheplatform.workingwithexceptions;

import knowingtheplatform.workingwithexceptions.myexceptions.NegativeValueException;
import knowingtheplatform.workingwithexceptions.myexceptions.OutOfBoundsValueException;

import java.math.BigDecimal;

public class WorkWithCustomizedExceptions {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            BigDecimal bigDecimal = calculator.doSomeMath(BigDecimal.valueOf(-1));
            System.out.println("Calculated values was: " + bigDecimal);
        } catch (NegativeValueException negativeValueException) {
            System.out.println("Some error occurs, error: " + negativeValueException.getMessage());
        }

        try {
            BigDecimal bigDecimal = calculator.doSomeMath(BigDecimal.valueOf(113));
            System.out.println("Calculated values was: " + bigDecimal);
        } catch (OutOfBoundsValueException outOfBoundsValueException) {
            System.out.println("Some error occurs, error: " + outOfBoundsValueException.getMessage());
        }

        try {
            BigDecimal bigDecimal = calculator.doSomeMath(BigDecimal.valueOf(3));
            System.out.println("Calculated values was: " + bigDecimal);
        } catch (Exception e) {
            System.out.println("Some error occurs, error: " + e.getMessage());
        }

        try {
            BigDecimal bigDecimal = calculator.doSomeMath(null);
            System.out.println("Calculated values was: " + bigDecimal);
        } catch (Exception e) {
            System.out.println("Some error occurs, error: " + e.getMessage());
        }

    }
}
