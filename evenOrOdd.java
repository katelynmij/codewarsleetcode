public class Solution {
    public static String evenOrOdd(int number) {
        String even = new String("Even");
        String odd = new String("odd");
        if (number % 2 == 0) {
            return even;
        } else {
            return odd;
        }
    }
} 