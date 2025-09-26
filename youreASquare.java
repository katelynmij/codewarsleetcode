public class Square {
    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        }
        
       for (int i = 0; i * i <= n; i++) {
        if (i * i == n) {
            return true;
        }
       }
       return false;
    }
}