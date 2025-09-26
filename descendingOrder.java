public class DescendingOrder {
	public static int sortDesc(final int num) {
		String numStr = String.valueOf(num);
		int[] digits = new int[numStr.length()];
		
		// array made of int digits	
		for (int i = 0; i < numStr.length(); i++) {
			digits[i] = Character.getNumericValue(numStr.charAt(i));
		}

		// sorts new array
		Arrays.sort(digits);

		// descending order
		StringBuilder finalInt = new StringBuilder();
		for (int i = digits.length - 1; i >= 0; i--) {
			finalInt.append(digits[i]);
		}

		//convert string to integer
		return Integer.parseInt(finalInt.toString());
	}
}
