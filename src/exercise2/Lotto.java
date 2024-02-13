package exercise2;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * This class generates random numbers for a Lotto game.
 */
public final class Lotto {
    /** Maximum number of iterations for the Lotto game. */
    private static final int MAX_ITERATIONS = 5;

    /** Size of the array that stores the Lotto numbers. */
    private static final int ARRAY_SIZE = 3;

    /** Maximum random number that can be generated for the Lotto game. */
    private static final int MAX_RANDOM = 9;

    /** Array that stores the generated Lotto numbers. */
    private int[] numbers = new int[ARRAY_SIZE];

    /**
     * Constructor generates random numbers.
     */
    public Lotto() {
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(MAX_RANDOM) + 1;
        }
    }

    /**
     * Returns the generated numbers.
     *
     * @return array of generated numbers
     */
    public final int[] getNumbers() {
        return numbers;
    }

    /**
     * Returns the sum of the generated numbers.
     *
     * @return sum of the numbers
     */
    public final int sum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Main method for the Lotto game.
     *
     * @param args should be final
     */
    public static void main(final String[] args) {
        String input = JOptionPane.showInputDialog("Number between 3 and 27: ");
        int userNumber = Integer.parseInt(input);

        for (int i = 0; i < MAX_ITERATIONS; i++) {
            Lotto lotto = new Lotto();
            int sum = lotto.sum();
            if (sum == userNumber) {
                JOptionPane.showMessageDialog(null, "You win! The numbers were "
                        + lotto.getNumbers()[0] + ", "
                        + lotto.getNumbers()[1] + ", "
                        + lotto.getNumbers()[2]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Computer wins!");
    }
}
