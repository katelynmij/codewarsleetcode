public class Kata {
    public static String solution(String str) {
        StringBuilder reversedString = new StringBuilder("");

        for (int i = str.length() - 1; i >= 0; i--) {
            char newChar = str.charAt(i);
            reversedString.append(newChar);
        }
        return reversedString.toString();
    }
}