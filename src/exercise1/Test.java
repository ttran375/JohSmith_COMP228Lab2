package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private final String[] questions = {
            "Question 1: Which of the following tools support the software-development process, including editors for writing and editing programs and debuggers for locating logic errors—errors that cause programs to execute incorrectly?",
            "Question 2: What is the main function of a Java compiler?",
            "Question 3: Which of the following components does a Java application need to have at least one of?",
            "Question 4: Which of the following typically groups related classes so that they could be imported into programs and reused?",
            "Question 5: There are variables for which each object of a class does not need its own separate copy. They are called_______________."
    };

    private final String[][] options = {
            { "Java Development Kit (JDK)", "Java Virtual Machine (JVM)", "Java Integrated Development Envronments (IDE)", "Java Application Programming Interfaces (API)" },
            { "It translates the Java source code into bytecodes that represent the tasks to execute.", "It places the program in memory to execute it", "It executes the bytecodes", "It examines the bytecodes to ensure that they  are valid and do not violate Java’s security restrictions." },
            { "Local variable", "Instance variable", "Non-static Method", "Class" },
            { "Package", "Method", "IDE", "Function" },
            { "class variables", "constants", "local variables", "instance variables" }
    };

    private final int[] answers = { 2, 0, 3, 0, 0 };
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
        String message;
        switch (random.nextInt(4)) {
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

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) simulateQuestion(i);
        JOptionPane.showMessageDialog(null, "You scored " + score + " out of " + questions.length);
    }
}
