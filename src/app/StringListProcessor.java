package app;

public class StringListProcessor {

    private static int countUppercase(String s) {
        // Перевіряємо чи не пусте значення отримуємо
        if(s == null || s.isEmpty()) {
            return 0;
        }

        int count = 0; // Додаємо лічильник

        // Перетворюємо значення s в масив символів і проходимось по ньому
        for (char letter : s.toCharArray()) {
            if(Character.isUpperCase(letter)) {
                count++; // Інкрементуємо значення, якщо символ з масиву у верхньому регістрі
            }
        }

        return count;
    }

    public static int getCountUppercase(String s) {
        return countUppercase(s);
    }
}
