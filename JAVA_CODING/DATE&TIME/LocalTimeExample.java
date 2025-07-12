import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Current time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        // Specific time
        LocalTime lunchTime = LocalTime.of(13, 0); // 1:00 PM
        System.out.println("Lunch Time: " + lunchTime);

        // Get parts of time
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());

        // Add/Subtract time
        LocalTime after2Hours = now.plusHours(2);
        System.out.println("After 2 Hours: " + after2Hours);

        LocalTime before30Min = now.minusMinutes(30);
        System.out.println("30 Minutes Ago: " + before30Min);

        // Compare times
        if (now.isBefore(lunchTime)) {
            System.out.println("It's before lunch time.");
        } else {
            System.out.println("It's after lunch time.");
        }
    }
}
