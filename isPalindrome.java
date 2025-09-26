class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i --) {
            newString.append(s.charAt(i));
        }
        return newString;

        if (newString.toString.equals(s)) {
            return true;
        }
    }
}