package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Zoned date and time
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date and Time: " + zonedDateTime);

        // Instant
        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);

        // Duration
        Duration duration = Duration.ofHours(3);
        System.out.println("Duration: " + duration);

        // Period
        Period period = Period.ofMonths(2);
        System.out.println("Period: " + period);

        // Formatting and parsing
        DateTimeFormatter formatter = DateTimeFormatter
        		.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}