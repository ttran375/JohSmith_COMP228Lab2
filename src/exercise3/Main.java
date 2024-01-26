package exercise3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        CustomDate customDate = new CustomDate(currentDate);
        System.out.println("Current Date: " + currentDate);

        LocalDate futureDate1 = customDate.addDays(7);
        System.out.println("Date after adding 7 days: " + futureDate1);

        LocalDate futureDate2 = customDate.addMonths(3);
        System.out.println("Date after adding 3 months: " + futureDate2);

        LocalDate futureDate3 = customDate.addYears(2);
        System.out.println("Date after adding 2 years: " + futureDate3);

        LocalDate futureDate4 = customDate.addDateComponents(1, 6, 15);
        System.out.println("Date after adding 1 year, 6 months, and 15 days: " + futureDate4);
    }
}
