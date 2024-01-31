package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private final String[] questions = {
            "Question 1",
            "Question 2",
            "Question 3",
            "Question 4",
            "Question 5"
    };

    private final String[][] options = {
            { "Option 1", "Option 2", "Option 3", "Option 4" },
            { "Option 1", "Option 2", "Option 3", "Option 4" },
            { "Option 1", "Option 2", "Option 3", "Option 4" },
            { "Option 1", "Option 2", "Option 3", "Option 4" },
            { "Option 1", "Option 2", "Option 3", "Option 4" }
    };

    private final int[] answers = { 0, 1, 2, 3, 1 };
    private int score = 0;

    public void simulateQuestion(int questionNumber) {
        String question = questions[questionNumber];
        String[] option = options[questionNumber];
        String answer = JOptionPane.showInputDialog(null, question + "\n" + String.join("\n", option));
        checkAnswer(questionNumber, answer);
    }

    public void checkAnswer(int questionNumber, String answer) {
        if (Integer.parseInt(answer) == answers[questionNumber]) {
            score++;
            generateMessage(true);
        } else {
            generateMessage(false);
        }
    }

    public void generateMessage(boolean isCorrect) {
        Random random = new Random();
        String message = switch (random.nextInt(4)) {
            case 0 -> isCorrect ? "Excellent!" : "No. Please try again";
            case 1 -> isCorrect ? "Good!" : "Wrong. Try once more";
            case 2 -> isCorrect ? "Keep up the good work!" : "Don't give up!";
            default -> isCorrect ? "Nice work!" : "No. Keep trying..";
        };
        JOptionPane.showMessageDialog(null, message);
    }

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) simulateQuestion(i);
        JOptionPane.showMessageDialog(null, "You scored " + score + " out of " + questions.length);
    }
}
