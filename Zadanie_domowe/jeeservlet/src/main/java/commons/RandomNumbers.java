package commons;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

    Random random;
    int limit;
    int[] randomNumbers;

    public RandomNumbers(int limit) {
        this.random = new Random();
        this.limit = limit;
        this.randomNumbers = new int[limit];
        generateRandomNumbers();
    }

    private void generateRandomNumbers() {
        for (int i = 0; i < limit; i++) {
            randomNumbers[i] = random.nextInt(100);
        }
    }

    public int[] getRandomNumbers() {
        return randomNumbers;
    }

    public int[] getRandomNumbersSorted() {
        int[] tempArray = Arrays.copyOf(randomNumbers, limit);
        Arrays.sort(tempArray);
        return tempArray;
    }
}
