package exercise3;

public class Date {
    private int day;
    private int month;
    private int year;

    private static final int DAYS_IN_FEB_LEAP_YEAR = 29;
    private static final int DAYS_IN_FEB_NON_LEAP_YEAR = 28;
    private static final int DAYS_IN_SHORT_MONTH = 30;
    private static final int DAYS_IN_LONG_MONTH = 31;

    private static final int MONTHS_IN_YEAR = 12;

    public Date(final int inputDay, final int inputMonth, final int inputYear) {
        this.day = inputDay;
        this.month = inputMonth;
        this.year = inputYear;
        normalize();
    }

    private static final int DEFAULT_DAY = 1;
    private static final int DEFAULT_MONTH = 1;
    private static final int DEFAULT_YEAR = 2022;

    public Date() {
        this(DEFAULT_DAY, DEFAULT_MONTH, DEFAULT_YEAR);
    }

    public void add(final int daysToAdd) {
        day += daysToAdd;
        normalize();
    }

    public void add(final int monthsToAdd, final int daysToAdd) {
        month += monthsToAdd;
        day += daysToAdd;
        normalize();
    }

    public void add(final Date other) {
        year += other.year;
        month += other.month;
        day += other.day;
        normalize();
    }

    @Override
    public String toString() {
        String monthText = getMonthText(month);
        return year + "-" + monthText + "-" + day;
    }

    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    public static String getMonthText(final int month) {
        switch (month) {
            case JANUARY:
                return "Jan";
            case FEBRUARY:
                return "Feb";
            case MARCH:
                return "Mar";
            case APRIL:
                return "Apr";
            case MAY:
                return "May";
            case JUNE:
                return "Jun";
            case JULY:
                return "Jul";
            case AUGUST:
                return "Aug";
            case SEPTEMBER:
                return "Sep";
            case OCTOBER:
                return "Oct";
            case NOVEMBER:
                return "Nov";
            case DECEMBER:
                return "Dec";
            default:
                return "Unknown";
        }
    }

    private static int getDaysInMonth(final int year, final int month) {
        switch (month) {
            case FEBRUARY:
                return isLeapYear(year)
                    ? DAYS_IN_FEB_LEAP_YEAR
                    : DAYS_IN_FEB_NON_LEAP_YEAR;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return DAYS_IN_SHORT_MONTH;
            default:
                return DAYS_IN_LONG_MONTH;
        }
    }

    private static final int LEAP_YEAR_DIVISOR_1 = 4;
    private static final int LEAP_YEAR_DIVISOR_2 = 100;
    private static final int LEAP_YEAR_DIVISOR_3 = 400;

    private static boolean isLeapYear(final int year) {
        return (year % LEAP_YEAR_DIVISOR_1 == 0
            && year % LEAP_YEAR_DIVISOR_2 != 0)
            || (year % LEAP_YEAR_DIVISOR_3 == 0);
    }

    private void normalize() {
        int daysInMonth = getDaysInMonth(year, month);
        while (day > daysInMonth) {
            day -= daysInMonth;
            month++;
        }

        while (month > MONTHS_IN_YEAR) {
            month -= MONTHS_IN_YEAR;
            year++;
        }
    }
}
