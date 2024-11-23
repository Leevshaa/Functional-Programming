package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // Анонімний клас
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        String inputData = "Тестовий рядок";

        int result = addition.operate(4, 10);
        System.out.println("\nРезультат роботи функціонального інтерфейсу MathOperation: " + result +
                " (додавання).");

        StringManipulator lineToUpperCase = line -> line.toUpperCase();
        String result2 = lineToUpperCase.manipulate(inputData);
        System.out.println("Результат роботи функціонального інтерфейсу StringManipulator: " +
                result2 + " (рядок перетворюється у верхній регістр).");


        int result3 = StringListProcessor.getCountUppercase(inputData);
        System.out.println("Результат роботи класу StringListProcessor: " + result3 +
                " (відображається кількість великих літер у рядку).");

        Function<String, Integer> uppercaseCounter = StringListProcessor::getCountUppercase;
        int result4 = uppercaseCounter.apply(inputData);
        System.out.println("Результат роботи класу StringListProcessor через посилання" +
                " на його метод у функції uppercaseCounter: " + result4 +
                " (відображається кількість великих літер у рядку).");


        try {
            Supplier<Integer> randomNumber = () -> RandomNumberGenerator
                    .getGenerateRandomNumber(0, 100000);
            int result5 = randomNumber.get(); // постачальник
            System.out.println("Результат роботи класу RandomNumberGenerator: " + result5 +
                    " (отримуємо рандомне число у визначено діапазоні).");
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка в аргументах функції. Мінімальне число більше максимального!");
        }
    }
}
