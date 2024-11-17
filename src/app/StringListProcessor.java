package app;

public class StringListProcessor {

    private static int countUppercase(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (char letter : s.toCharArray()) {
            if(Character.isUpperCase(letter)) {
                count++;
            }
        }

        return count;
    }
}
