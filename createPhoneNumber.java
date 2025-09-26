public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder newNumber = new StringBuilder("()");
        for (int i = 0; i < 3; i++) {
            newNumber.append(numbers[i]);
        }
        newNumber.append(") ");
        
        for (int i = 3; i < 6; i++)  {
            newNumber.append(numbers[i]);
        }
        newNumber.append("-");

        for (int i = 6; i < 10; i++) {
            newNumber.append(numbers[i]);
        }
        return newNumber.toString();
    }
}