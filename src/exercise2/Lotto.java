package exercise2;

/**
 * This package contains the Lotto class for generating random numbers.
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number between 3 and 27");
        int userNumber = Integer.parseInt(input);

        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int sum = lotto.sum();
            if (sum == userNumber) {
                JOptionPane.showMessageDialog(null, "You win! The numbers were " + lotto.getNumbers()[0] + ", "
                        + lotto.getNumbers()[1] + ", " + lotto.getNumbers()[2]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Computer wins! Better luck next time.");
    }

    private int[] numbers = new int[3];

    public Lotto() {
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(9) + 1;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int sum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
