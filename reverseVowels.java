class Solution {
    public String reverseVowels(String s) {
// leetcode
// e e o e
// e o e e
// l e o t c e d e
        // empty string vowels to hold vowels
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {
                vowels.append(s.charAt(i));
            }
        } // vowels now holds all vowels in original string

        vowels.reverse(); // vowels now holds all reversed vowels ex "e o e e"
        int vowelIndex = 0;
        StringBuilder result = new StringBuilder(); // empty string result to hold string with reversed vowels
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {
                result.append(vowels.charAt(vowelIndex));
                vowelIndex++;
                // if theres a vowel in the original string, it gets replaced by the reversed vowel in the new result string
            } else {
                result.append(s.charAt(i));
            } // if the character isnt a vowel, replace the character with the original character in the given string
        }
        return result.toString();
    }
}