class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++) {
                if (wordsDict[i].equals(word1)) {
                    for (int j = 0; j < wordsDict.length; j++) {
                        if (wordsDict[j].equals(word2)) {
                            int difference = Math.abs(i - j);
                            distance = Math.min(distance, difference);
                        }
                    }
                }
            }
        return distance;
        }
    
}
