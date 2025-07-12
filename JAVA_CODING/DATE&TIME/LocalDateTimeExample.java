import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        // Specific date and time
        LocalDateTime meeting = LocalDateTime.of(2025, 6, 15, 10, 30);
        System.out.println("Meeting Time: " + meeting);

        // Get parts
        System.out.println("Year: " + now.getYear());
        System.out.println("Month: " + now.getMonth());
        System.out.println("Day: " + now.getDayOfMonth());
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());

        // Add/Subtract
        LocalDateTime nextWeek = now.plusDays(7);
        System.out.println("Same Time Next Week: " + nextWeek);

        LocalDateTime oneHourAgo = now.minusHours(1);
        System.out.println("One Hour Ago: " + oneHourAgo);

        // Convert to LocalDate and LocalTime
        System.out.println("Only Date: " + now.toLocalDate());
        System.out.println("Only Time: " + now.toLocalTime());
    }
}
