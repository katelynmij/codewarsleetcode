public class Troll {
    private static boolean isVowel(char character) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static String disemvowel(String str) {
        StringBuilder newComent = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch)) {
                newComent.append(ch);
            }
        }
        return newComent.toString();
    }
}