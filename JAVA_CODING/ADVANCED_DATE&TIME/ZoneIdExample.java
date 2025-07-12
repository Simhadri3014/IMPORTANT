import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {
    public static void main(String[] args) {
        // Get the system default time zone
        ZoneId systemZone = ZoneId.systemDefault();
        System.out.println("System Default Zone: " + systemZone);

        // Create a ZoneId for a specific region
        ZoneId kolkataZone = ZoneId.of("Asia/Kolkata");
        System.out.println("Kolkata Zone: " + kolkataZone);

        // Get the current date and time in that zone
        ZonedDateTime dateTimeInKolkata = ZonedDateTime.now(kolkataZone);
        System.out.println("Current Date and Time in Kolkata: " + dateTimeInKolkata);

        // List all available zone IDs
        System.out.println("\nAvailable Zone IDs:");
        ZoneId.getAvailableZoneIds().stream()
              .limit(10) // Just show first 10 for brevity
              .forEach(System.out::println);
    }
}
