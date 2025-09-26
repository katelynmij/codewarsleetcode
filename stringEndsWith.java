public class Kata {
    public static boolean solution(String str, String ending) {
        if (ending.length() > str.length()) {
            return false;
        } else {
            if (str.substring(str.length() - ending.length()).equals(ending)) {
                return true;
            } else {
                return false;
            }
        }
    }
}