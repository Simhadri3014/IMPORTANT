import java.time.ZoneOffset;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        // Create a ZoneOffset for +05:30 (India Standard Time)
        ZoneOffset offset = ZoneOffset.of("+05:30");
        System.out.println("Zone Offset: " + offset);

        // Create a LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local DateTime: " + localDateTime);

        // Combine LocalDateTime with ZoneOffset to get OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println("Offset DateTime: " + offsetDateTime);
    }
}
