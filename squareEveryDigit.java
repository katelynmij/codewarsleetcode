public class SquareDigit {
    public int squareDigits(int n) {
        String number = String.valueOf(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            int square = digit * digit;
            result.append(square);
        }
        return Integer.parseInt(result.toString());
    }
}