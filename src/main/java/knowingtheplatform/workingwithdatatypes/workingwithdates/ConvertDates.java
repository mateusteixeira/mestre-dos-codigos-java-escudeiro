package knowingtheplatform.workingwithdatatypes.workingwithdates;

import java.time.*;

public class ConvertDates {

    public static void main(String[] args) {

        System.out.println("Converting LocalDate:");
        LocalDate now = LocalDate.now();
        System.out.println("Value initial: " +now);
        System.out.println("Converting LocalDate to LocalDateTime using atStartOfDay: " + now.atStartOfDay());
        System.out.println("Converting LocalDate to LocalDateTime using atTime and LocalTime.now(): " + now.atTime(LocalTime.now()));
        System.out.println("Converting LocalDate to LocalDateTime using atTime: " + now.atTime(21, 12, 32));
        System.out.println("Converting LocalDate to YearMonth: " + YearMonth.from(now));
        System.out.println("Converting LocalDate to MonthDay: " + MonthDay.from(now));

        System.out.println();
        System.out.println("Converting LocalDateTime:");
        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        System.out.println("Value initial: " +nowLocalDateTime);
        System.out.println("Converting LocalDateTime to LocalDate: " + nowLocalDateTime.toLocalDate());
        System.out.println("Converting LocalDateTime to LocalTime: " + nowLocalDateTime.toLocalTime());
        System.out.println("Converting LocalDateTime to YearMonth: " + YearMonth.from(nowLocalDateTime));
        System.out.println("Converting LocalDateTime to MonthDay: " + MonthDay.from(nowLocalDateTime));

        System.out.println();
        System.out.println("Converting YearMonth: ");
        YearMonth yearMonth = YearMonth.now();
        System.out.println("Converting YearMonth to LocalDate using atDay: " + yearMonth.atDay(1));
        System.out.println("Converting YearMonth to LocalDateTime using atDay and LocalTime: " + yearMonth.atDay(30).atTime(LocalTime.now()));
        System.out.println("Converting YearMonth to MonthDay: " + MonthDay.of(yearMonth.getMonth(), yearMonth.atEndOfMonth().getDayOfMonth()));
    }


}
