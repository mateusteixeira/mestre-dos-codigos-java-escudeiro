package knowingtheplatform.workingwithdatatypes.workingwithdates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkWithLocalTime {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("Getting a actual time with now(): " + now);
        System.out.println("Manipulating time adding 5 hours from now: " + now.plusHours(5));
        System.out.println("Manipulating time adding 1 minute from now: " + now.plusMinutes(1));
        System.out.println("Manipulating time adding 20 seconds from now: " + now.plusSeconds(20));
        System.out.println("Manipulating time subtracting 2 hours from now: " + now.minusHours(2));
        System.out.println("Extracting minutes from now: " + now.getMinute());
        System.out.println("Formatting time: " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        LocalTime time = LocalTime.of(10, 6, 30);
        System.out.println("Another initialization for LocalTime, using of(): " +time);
        System.out.println("Using isAfter to compare two times. Now is after time? " + now.isAfter(time));
        System.out.println("Using isBefore to compare two dates. Now is before time? " + now.isBefore(time));
        System.out.println("Using isEqual to compare two dates. Now is equals time? " + now.equals(time));

    }

}
