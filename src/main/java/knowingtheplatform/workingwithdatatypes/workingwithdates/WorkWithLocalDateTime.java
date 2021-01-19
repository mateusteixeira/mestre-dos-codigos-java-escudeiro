package knowingtheplatform.workingwithdatatypes.workingwithdates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WorkWithLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Getting a actual date-time with now(): " + now);
        System.out.println("Manipulating date-time adding 5 days from now: " + now.plusDays(5));
        System.out.println("Manipulating date-time adding 1 month from now: " + now.plusMonths(1));
        System.out.println("Manipulating date-time adding 2 years from now: " + now.plusYears(2));
        System.out.println("Manipulating time adding 2 hours from now: " + now.plusHours(2));
        System.out.println("Manipulating date-time subtracting 2 days from now: " + now.minusDays(2));
        System.out.println("Extracting day of week from now: " + now.getDayOfWeek());
        System.out.println("Extracting nano from now: " + now.getNano());
        System.out.println("Formatting date-time to our pattern: " + now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        LocalDateTime bDay = LocalDateTime.of(1992, 06, 30, 8, 30, 9);
        System.out.println("Another initialization for LocalDateTime, using of(): " +bDay);
        System.out.println("Using isAfter to compare two dates. Now is after bDay? " + now.isAfter(bDay));
        System.out.println("Using isBefore to compare two dates. Now is before bDay? " + now.isBefore(bDay));
        System.out.println("Using isEqual to compare two dates. Now is equals bDay? " + now.isEqual(bDay));

    }

}
