// File: exercise1/package-info.java
/**
 * This package contains the Main class for exercise 1.
 */
package exercise1;

/**
 * This is the main class for exercise 1.
 */
public final class Main {

    private Main() {
        // Prevent instantiation
    }

    /**
     * The entry point of the application.
     *
     * @param args the input arguments
     */
    public static void main(final String[] args) {
        Test test = new Test();
        test.inputAnswer();
    }
}
