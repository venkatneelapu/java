import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }

    public static void displayCalendar(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // Set to the first day of the specified month and year

        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Get the day of the week for the first day of the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        // Move the calendar back to the beginning of the week
        calendar.add(Calendar.DAY_OF_MONTH, -startDay + 1);

        // Print the days of the month
        while (calendar.get(Calendar.MONTH) == month - 1) {
            for (int i = 0; i < 7; i++) {
                System.out.printf("%5d", calendar.get(Calendar.DAY_OF_MONTH));
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                if (calendar.get(Calendar.MONTH) != month - 1)
                    break;
            }
            System.out.println();
        }
    }
}
