package app;

public class RandomNumberGenerator {

    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * max);
    }
}
