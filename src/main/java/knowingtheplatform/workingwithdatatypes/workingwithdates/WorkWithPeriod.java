package knowingtheplatform.workingwithdatatypes.workingwithdates;

import java.time.LocalDate;
import java.time.Period;

public class WorkWithPeriod {

    public static void main(String[] args) {

        Period periodOfDays = Period.ofDays(35);
        Period periodOfMonths = Period.ofMonths(3);
        Period periodOfYears = Period.ofYears(2);
        System.out.println("Getting a period of days: " + periodOfDays.getDays());
        System.out.println("Getting a period of months: " + periodOfMonths.getMonths());
        System.out.println("Getting a period of years: " + periodOfYears.getYears());

        LocalDate now = LocalDate.now();

        System.out.println("Manipulating date adding days to now: " + now + " added: " + periodOfDays.addTo(now));
        System.out.println("Manipulating date subtracting months to now: " + now + " added: " + periodOfMonths.subtractFrom(now));
        System.out.println("Manipulating date adding years to now: " + now + " added: " + periodOfYears.addTo(now));

        Period periodOfWeeks = Period.ofWeeks(6);
        System.out.println("Working between periods, adding weeks to days: " + periodOfDays.plus(periodOfWeeks).getDays());

        Period of = Period.of(2019, 4, 3);
        System.out.println("Getting period with of: " +of);
        System.out.println("Getting period difference in months between two dates: " + Period.between(LocalDate.of(2019, 5, 29), now).toTotalMonths());
    }

}
