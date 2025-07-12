import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        // Current UTC timestamp
        Instant now = Instant.now();
        System.out.println("Current Instant (UTC): " + now);

        // Add 60 seconds
        Instant later = now.plusSeconds(60);
        System.out.println("60 Seconds Later: " + later);

        // Subtract 1 hour (3600 seconds)
        Instant earlier = now.minusSeconds(3600);
        System.out.println("1 Hour Ago: " + earlier);

        // Compare instants
        if (now.isBefore(later)) {
            System.out.println("Now is before later.");
        }

        // Create Instant from epoch seconds
        Instant fromEpoch = Instant.ofEpochSecond(0);
        System.out.println("Epoch Start: " + fromEpoch);
    }
}
