package knowingtheplatform.workingwithdatatypes.workingwithdates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkWithLocalDate {

    public static void main(String[] args) {

        WorkWithLocalDate workWithLocalDate = new WorkWithLocalDate();

        LocalDate now = LocalDate.now();
        System.out.println("Getting a actual date with now(): " + now);
        System.out.println("Manipulating date adding 5 days from now: " + workWithLocalDate.sumFiveDaysInDate(now));
        System.out.println("Manipulating date adding 1 month from now: " + workWithLocalDate.sumOneMonthInDate(now));
        System.out.println("Manipulating date adding 2 years from now: " + workWithLocalDate.sumYearInDate(now, 1));
        System.out.println("Manipulating date subtracting 2 days from now: " + now.minusDays(2));
        System.out.println("Extracting day of week from now: " + now.getDayOfWeek());
        System.out.println("Formatting date to our pattern: " + now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDate bDay = LocalDate.of(1992, 06, 30);
        System.out.println("Another initialization for LocalDate, using of(): " +bDay);
        System.out.println("Using isAfter to compare two dates. Now is after bDay? " + now.isAfter(bDay));
        System.out.println("Using isBefore to compare two dates. Now is before bDay? " + now.isBefore(bDay));
        System.out.println("Using isEqual to compare two dates. Now is equals bDay? " + now.isEqual(bDay));

    }

    protected LocalDate sumFiveDaysInDate(LocalDate localDate) {
        return localDate.plusDays(5);
    }

    protected LocalDate sumOneMonthInDate(LocalDate localDate) {
        return localDate.plusMonths(1);
    }

    protected LocalDate sumYearInDate(LocalDate localDate, int years) {
        return localDate.plusYears(years);
    }

}
