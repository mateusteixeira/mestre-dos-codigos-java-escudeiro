package knowingtheplatform.workingwithexceptions;

import knowingtheplatform.workingwithexceptions.myexceptions.NegativeValueException;
import knowingtheplatform.workingwithexceptions.myexceptions.OutOfBoundsValueException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Calculator calculator =  new Calculator();

    @Test
    public void should_throws_exception_when_value_negative() {
        expectedException.expect(NegativeValueException.class);
        expectedException.expectMessage("Number cannot be negative!");

        calculator.doSomeMath(BigDecimal.valueOf(-4));
    }

    @Test
    public void should_throws_exception_when_value_too_high_for_the_process() {
        expectedException.expect(OutOfBoundsValueException.class);
        expectedException.expectMessage("Number to high for this process");

        calculator.doSomeMath(BigDecimal.valueOf(110));
    }

    @Test
    public void should_multiply_by_value() {
        BigDecimal result = calculator.doSomeMath(BigDecimal.valueOf(3));
        assertNotNull(result);
        assertEquals(BigDecimal.TEN.multiply(BigDecimal.valueOf(3)), result);
    }
}