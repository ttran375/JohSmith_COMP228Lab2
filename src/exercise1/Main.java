/**
 * This is the main class for the exercise1 package.
 */
package exercise1;

public class Main {
    /**
     * Private constructor to prevent instantiation.
     */
    private Main() {
        // prevents instantiation
    }

    /**
     * This is the main method which makes use of inputAnswer method.
     * @param args Unused.
     */
    public static void main(final String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }
}