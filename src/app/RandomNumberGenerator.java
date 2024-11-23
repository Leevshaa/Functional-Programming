package app;

public class RandomNumberGenerator {

    private static int generateRandomNumber(int min, int max) {

        if (min > max) {
            throw new IllegalArgumentException("Мінімальне число більше за максимальне");
        }
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int getGenerateRandomNumber(int min, int max) {
        return generateRandomNumber(min, max);
    }
}
