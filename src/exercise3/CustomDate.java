package exercise3;

import java.time.LocalDate;

public class CustomDate {
    private LocalDate date;

    public CustomDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate addDays(int days) {
        return date.plusDays(days);
    }

    public LocalDate addMonths(int months) {
        return date.plusMonths(months);
    }

    public LocalDate addYears(int years) {
        return date.plusYears(years);
    }

    public LocalDate addDateComponents(int years, int months, int days) {
        return date.plusYears(years).plusMonths(months).plusDays(days);
    }

    
}
