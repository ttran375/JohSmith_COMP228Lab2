package exercise2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number between 3 and 27");
        int userNumber = Integer.parseInt(input);
        int tries = 0;

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
