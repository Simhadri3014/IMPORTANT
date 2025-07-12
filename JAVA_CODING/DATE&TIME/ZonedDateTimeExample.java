import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // Current date and time with system default timezone
        ZonedDateTime currentZoned = ZonedDateTime.now();
        System.out.println("Current ZonedDateTime: " + currentZoned);

        // Specific timezone
        ZoneId indiaZone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime indiaTime = ZonedDateTime.now(indiaZone);
        System.out.println("India Time: " + indiaTime);

        // Convert to another timezone
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = indiaTime.withZoneSameInstant(newYorkZone);
        System.out.println("Same Time in New York: " + newYorkTime);

        // Create ZonedDateTime from LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.of(2025, 6, 15, 10, 0);
        ZonedDateTime zonedFromLocal = ZonedDateTime.of(localDateTime, indiaZone);
        System.out.println("Custom ZonedDateTime: " + zonedFromLocal);
    }
}
