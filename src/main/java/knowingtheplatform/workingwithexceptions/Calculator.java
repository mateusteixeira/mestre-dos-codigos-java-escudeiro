package knowingtheplatform.workingwithexceptions;

import knowingtheplatform.workingwithexceptions.myexceptions.NegativeValueException;
import knowingtheplatform.workingwithexceptions.myexceptions.OutOfBoundsValueException;

import java.math.BigDecimal;

public class Calculator {

    private BigDecimal ten = BigDecimal.TEN;

    protected BigDecimal doSomeMath(BigDecimal value) {
        if(value.compareTo(BigDecimal.ZERO) < 0) {
            throw new NegativeValueException("Number cannot be negative!");
        } else if (value.compareTo(BigDecimal.valueOf(100)) > 0) {
            throw new OutOfBoundsValueException("Number to high for this process");
        }
        return ten.multiply(value);
    }
}
