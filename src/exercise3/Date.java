package exercise3;

/**
 * Represents a date with day, month, and year components.
 */
public class Date {
    private int day;
    private int month;
    private int year;

    /**
     * Constructs a Date object with the given day, month, and year components.
     *
     * @param day   The day component.
     * @param month The month component.
     * @param year  The year component.
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        normalize();
    }

    /**
     * Default constructor initializes the date to January 1, 2022.
     */
    public Date() {
        this(1, 1, 2022);
    }

    /**
     * Adds the specified number of days to the date.
     *
     * @param days The number of days to add.
     */
    public void add(int days) {
        day += days;
        normalize();
    }

    /**
     * Adds the specified number of months and days to the date.
     *
     * @param months The number of months to add.
     * @param days   The number of days to add.
     */
    public void add(int months, int days) {
        month += months;
        day += days;
        normalize();
    }

    /**
     * Adds the components of another Date to this Date.
     *
     * @param other The Date to add.
     */
    public void add(Date other) {
        year += other.year;
        month += other.month;
        day += other.day;
        normalize();
    }

    /**
     * Returns a string representation of the Date in the format "YYYY-MMM-DD".
     *
     * @return The string representation of the Date.
     */
    @Override
    public String toString() {
        String monthText = getMonthText(month);
        return year + "-" + monthText + "-" + day;
    }

    /**
     * Gets the three-letter abbreviation of the month for a given month number.
     *
     * @param month The month number (1-12).
     * @return The three-letter abbreviation of the month.
     */
    public static String getMonthText(int month) {
        switch (month) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
            default:
                return "Unknown";
        }
    }

    /**
     * Gets the number of days in a specific month of a given year.
     *
     * @param year  The year.
     * @param month The month (1-12).
     * @return The number of days in the specified month.
     */
    private static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    /**
     * Checks if a given year is a leap year.
     *
     * @param year The year.
     * @return True if the year is a leap year, false otherwise.
     */
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private void normalize() {
        int daysInMonth = getDaysInMonth(year, month);
        while (day > daysInMonth) {
            day -= daysInMonth;
            month++;
        }

        while (month > 12) {
            month -= 12;
            year++;
        }
    }
}
