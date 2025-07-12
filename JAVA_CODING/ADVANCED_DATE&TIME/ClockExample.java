import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClockExample {
    public static void main(String[] args) {
        // Get the system default clock
        Clock systemClock = Clock.systemDefaultZone();
        System.out.println("System Clock: " + systemClock);

        // Get the current instant from the clock
        Instant instant = systemClock.instant();
        System.out.println("Current Instant: " + instant);

        // Get the current time in a specific zone using Clock
        Clock kolkataClock = Clock.system(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime kolkataTime = ZonedDateTime.now(kolkataClock);
        System.out.println("Current Time in Kolkata: " + kolkataTime);

        // Fixed clock for testing (always returns the same time)
        Clock fixedClock = Clock.fixed(Instant.parse("2025-01-01T00:00:00Z"), ZoneId.of("UTC"));
        System.out.println("Fixed Clock Time: " + fixedClock.instant());
    }
}
