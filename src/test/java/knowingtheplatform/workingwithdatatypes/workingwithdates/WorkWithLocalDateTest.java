package knowingtheplatform.workingwithdatatypes.workingwithdates;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class WorkWithLocalDateTest {

    private WorkWithLocalDate workWithLocalDate = new WorkWithLocalDate();
    private LocalDate aLocalDate = LocalDate.of(2021, 10, 1);

    @Test
    public void should_assert_sum_of_five_days_in_local_date() {
        LocalDate expectedResult = aLocalDate.plusDays(5);
        LocalDate result = workWithLocalDate.sumFiveDaysInDate(aLocalDate);
        assertNotNull(result);
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_assert_sum_of_one_month_in_local_date() {
        LocalDate expectedResult = aLocalDate.plusMonths(1);
        LocalDate result = workWithLocalDate.sumOneMonthInDate(aLocalDate);
        assertNotNull(result);
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_assert_sum_of_years_in_local_date() {
        LocalDate expectedResult = aLocalDate.plusYears(10);
        LocalDate result = workWithLocalDate.sumYearInDate(aLocalDate, 10);
        assertNotNull(result);
        assertEquals(expectedResult, result);
    }
}