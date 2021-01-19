package knowingtheplatform.workingwithexceptions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WorkWithArithmeticException {

    protected static BigDecimal divideByZero() {
        return BigDecimal.TEN.divide(BigDecimal.ZERO, 2, RoundingMode.HALF_UP);
    }

}
