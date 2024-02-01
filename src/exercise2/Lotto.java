package exercise2;

import java.util.Random;

public class Lotto {
    private final int[] numbers = new int[3];

    public Lotto() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            numbers[i] = rand.nextInt(9) + 1;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int sumNumbers() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
