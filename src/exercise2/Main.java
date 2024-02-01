package exercise2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String input = null;
        int userNumber = -1;
        int tries = 0;

        while (userNumber < 3 || userNumber > 27) {
            try {
                input = JOptionPane.showInputDialog("Enter a number between 3 and 27");
                userNumber = Integer.parseInt(input);
                if (userNumber < 3 || userNumber > 27) {
                    JOptionPane.showMessageDialog(null, "The number must be between 3 and 27. Please try again.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
            tries++;
        }

        tries = 0;
        while (tries < 5) {
            Lotto lotto = new Lotto();
            int sum = lotto.sumNumbers();

            if (sum == userNumber) {
                JOptionPane.showMessageDialog(null, "You won!");
                return;
            }

            tries++;
        }
        JOptionPane.showMessageDialog(null, "Computer won!");
    }
}
