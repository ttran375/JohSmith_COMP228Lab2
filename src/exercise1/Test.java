package exercise1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * This class represents a test with multiple choice questions.
 */
public final class Test {

    private static final int MAX_ANSWER = 4;

    /**
     * Array of questions for the test.
     */
    private final String[] questions = {
            "Question 1: Which of the following tools support the...",
            "Question 2: What is the main function of a Java...",
            "Question 3: Which of the following components...",
            "Question 4: Which of the following typically...",
            "Question 5: There are variables for which...",
    };

    /**
     * Array of options for each question in the test.
     */
    private final String[][] options = {
            { "1. JDK", "2. JVM", "3. IDE", "4. API" },
            {
                    "1. Translates source code",
                    "2. Places program in memory",
                    "3. Executes bytecodes",
                    "4. Examines bytecodes",
            },
            {
                    "1. Local variable",
                    "2. Instance variable",
                    "3. Non-static Method",
                    "4. Class",
            },
            { "1. Package", "2. Method", "3. IDE", "4. Function" },
            {
                    "1. class variables",
                    "2. constants",
                    "3. local variables",
                    "4. instance variables",
            },
    };

    /**
     * Array of correct answers for each question in the test.
     */
    private final int[] answers = { 3, 1, 4, 1, 1 };

    /**
     * The score of the test.
     */
    private int score = 0;

    /**
     * Simulates a question by displaying it and checking the answer.
     *
     * @param questionNumber the number of the question to simulate
     */
    public void simulateQuestion(final int questionNumber) {
        String question = questions[questionNumber];
        String[] option = options[questionNumber];
        String answer;
        do {
            answer = JOptionPane.showInputDialog(
                    null,
                    question + "\n" + String.join("\n", option));
            if (!isValidAnswer(answer)) {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid input. Please enter a number between 1 and 4.");
            }
        } while (!isValidAnswer(answer));
        checkAnswer(questionNumber, answer);
    }

    /**
     * Checks if the given answer is valid.
     *
     * @param answer the answer to check
     * @return true if the answer is valid, false otherwise
     */
    private boolean isValidAnswer(String answer) {
        try {
            int answerInt = Integer.parseInt(answer);
            return answerInt >= 1 && answerInt <= MAX_ANSWER;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks the given answer and updates the score if it is correct.
     *
     * @param questionNumber the number of the question
     * @param answer         the answer to check
     */
    public void checkAnswer(final int questionNumber, final String answer) {
        if (Integer.parseInt(answer) == answers[questionNumber]) {
            score++;
            generateMessage(true);
        } else {
            generateMessage(false);
        }
    }

    /**
     * Generates a message based on whether the answer is correct or not.
     *
     * @param isCorrect true if the answer is correct, false otherwise
     */
    public void generateMessage(final boolean isCorrect) {
        Random random = new Random();
        String message;
        switch (random.nextInt(MAX_ANSWER)) {
            case 0:
                message = isCorrect ? "Excellent!" : "No. Please try again";
                break;
            case 1:
                message = isCorrect ? "Good!" : "Wrong. Try once more";
                break;
            case 2:
                message = isCorrect ? "Keep up the good work!" : "Don't give up!";
                break;
            default:
                message = isCorrect ? "Nice work!" : "No. Keep trying..";
                break;
        }
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * Inputs the answer for each question and displays the score at the end.
     */
    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            simulateQuestion(i);
        }
        JOptionPane.showMessageDialog(
                null,
                "You scored " + score + " out of " + questions.length);
    }
}
