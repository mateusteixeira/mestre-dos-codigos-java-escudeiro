package knowingtheplatform.workingwithdatatypes.workingwithdates;

import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class WorkWithYearMonth {


    public static void main(String[] args) {
        YearMonth now = YearMonth.now();

        System.out.println("Getting a actual YearMonth with now(): " + now);
        System.out.println("Create a actual YearMonth combining with a day: " + now.atDay(5));
        System.out.println("Validating a day: Is 31 a valid day? " + now.isValidDay(31));
        System.out.println("Getting the month from now: " + now.getMonth());
        System.out.println("Getting the numeric month from now: " + now.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Getting the year from now: " + now.getYear());
        System.out.println("Formatting month-year to our pattern: " + now.format(DateTimeFormatter.ofPattern("MM-yyyy")));
        System.out.println("Manipulating yearMonth adding 4 months " + now.plusMonths(4));
        System.out.println("Is this a leap year? " + now.isLeapYear());

        YearMonth withOf = YearMonth.of(2020, Month.MARCH);
        System.out.println("Getting a YearMonth with of(): " +withOf);
        System.out.println("Using isAfter to compare two dates. Now is after withOf? " + now.isAfter(withOf));
        System.out.println("Using isBefore to compare two dates. Now is before withOf? " + now.isBefore(withOf));
        System.out.println("Using isEqual to compare two dates. Now is equals bDay? " + now.equals(withOf));
    }

}
