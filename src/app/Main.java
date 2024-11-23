package app;

public class Main {

    public static void main(String[] args) {

        // Анонімний клас
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int result = addition.operate(4, 10);
        System.out.println("Результат роботи функціонального інтерфейсу MathOperation: " + result +
                "(додавання).");

        String inputData = "Тестовий рядок";

        StringManipulator lineToUpperCase = line -> line.toUpperCase();
        String result2 = lineToUpperCase.manipulate(inputData);
        System.out.println("Результат роботи функціонального інтерфейсу StringManipulator: " +
                result2 + "(рядок перетворюється у верхній регістр).");


        int result3 = StringListProcessor.getCountUppercase(inputData);
        System.out.println("Результат роботи класу StringListProcessor: " + result3 +
                "(відображається кількість великих літер у рядку).");
    }
}
