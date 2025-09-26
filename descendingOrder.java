public class DescendingOrder {
	public static int sortDesc(final int num) {
		//sort
		//min is 0
		String numStr = String.valueOf(num);
		int[] digits = new int[numStr.length()];
		
		
		for (int i = 0; i < numStr.length(); i++) {
			digits[i] = Character.getNumericValue(numStr.charAt(i));
		}

		int min = digits[0];
		for (int i = 1; i < digits.length(); i++) {
			if (min > digits[i]) {
				min = digits[i];
			}
		}
	}
}
//finish later
