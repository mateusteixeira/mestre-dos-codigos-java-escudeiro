package knowingtheplatform.workingwithdatatypes.workingwithdates;

import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class WorkWithMonthDay {


    public static void main(String[] args) {
        MonthDay now = MonthDay.now();

        System.out.println("Getting a actual monthDay with now(): " + now);
        System.out.println("Create a actual monthDay combining with a year: " + now.atYear(2014));
        System.out.println("Validating a year: Is 2020 a valid year? " + now.isValidYear(2020));
        System.out.println("Getting the month from now: " + now.getMonth());
        System.out.println("Getting the numeric month from now: " + now.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Getting the day from now: " + now.getDayOfMonth());
        System.out.println("Formatting month-day to our pattern: " + now.format(DateTimeFormatter.ofPattern("dd-MM")));

        MonthDay withOf = MonthDay.of(Month.FEBRUARY, 24);
        System.out.println("Getting a monthDay with of(): " +withOf);
        System.out.println("Getting range of a month: " +withOf.range(ChronoField.DAY_OF_MONTH));
        System.out.println("Using isAfter to compare two dates. Now is after withOf? " + now.isAfter(withOf));
        System.out.println("Using isBefore to compare two dates. Now is before withOf? " + now.isBefore(withOf));
        System.out.println("Using isEqual to compare two dates. Now is equals bDay? " + now.equals(withOf));
    }

}
