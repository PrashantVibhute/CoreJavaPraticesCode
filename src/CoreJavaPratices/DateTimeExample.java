package CoreJavaPratices;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        // Create a specific date and time
        LocalDate date = LocalDate.of(2023, 12, 25);
        LocalTime time = LocalTime.of(10, 30);
        LocalDateTime specificDateTime = LocalDateTime.of(date, time);
        System.out.println("Specific date and time: " + specificDateTime);
    }
}