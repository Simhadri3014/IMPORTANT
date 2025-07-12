import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.LocalDateTime;

public class OffsetDateTimeExample {
    public static void main(String[] args) {
        // Create a LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.of(2025, 5, 26, 14, 30);
        System.out.println("LocalDateTime: " + localDateTime);

        // Create a ZoneOffset (e.g., +05:30 for IST)
        ZoneOffset offset = ZoneOffset.of("+05:30");

        // Combine LocalDateTime and ZoneOffset to create OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println("OffsetDateTime: " + offsetDateTime);

        // Get current OffsetDateTime with system default offset
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime: " + now);
    }
}
