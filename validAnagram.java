class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length != t.length) {
            return false;
        }

        //converts strings s and t to character arrays
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        //uses java's built in Arrays.sort to sort the characters alphabetically
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        // checks if both arrays are equal
        return Arrays.equals(sSort, tSort);
    }
}