import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        // Current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // Specific date
        LocalDate birthday = LocalDate.of(1995, 8, 15);
        System.out.println("Birthday: " + birthday);

        // Get parts of the date
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());
        System.out.println("Day of Week: " + today.getDayOfWeek());

        // Add/Subtract dates
        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Next Week: " + nextWeek);

        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Last Month: " + lastMonth);

        // Leap year check
        System.out.println("Is Leap Year? " + today.isLeapYear());
    }
}
