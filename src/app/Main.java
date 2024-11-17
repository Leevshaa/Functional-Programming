package app;

public class Main {

    public static void main(String[] args) {

        {
            MathOperation addition = new MathOperation() {
                @Override
                public int operate(int a, int b) {
                    return a + b;
                }
            };
        }

        StringManipulator lineToUpperCase = line -> line.toUpperCase();
    }
}
