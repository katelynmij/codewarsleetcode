public class Vowels {
    public static int getCount(String str) {
        int numbers = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numbers += 1;
            }
        }
        return numbers;
    }
}