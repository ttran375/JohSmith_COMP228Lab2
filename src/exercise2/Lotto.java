package exercise2;

/**
 * This package contains the Lotto class for generating random numbers.
 */

import java.util.Random;

/**
 * The Lotto class generates a set of random numbers.
 */
public final class Lotto {
    private static final int NUM_COUNT = 3;
    private static final int MAX_NUM = 9;
    private final int[] numbers = new int[NUM_COUNT];

    /**
     * Constructs a Lotto object and generates random numbers.
     */
    public Lotto() {
        Random rand = new Random();
        for (int i = 0; i < NUM_COUNT; i++) {
            numbers[i] = rand.nextInt(MAX_NUM) + 1;
        }
    }

    /**
     * Returns the generated numbers.
     *
     * @return the generated numbers
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Returns the sum of the generated numbers.
     *
     * @return the sum of the generated numbers
     */
    public int sumNumbers() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
