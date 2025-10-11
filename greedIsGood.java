public class Greed {
    public static int greedy(int[] dice) {
        int[] counts = new int[7];

        for (int die: dice) {
            counts[die]++
        }

        int score = 0;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) {
                switch (i) {
                    case 1:
                        score += 1000;
                        break;
                    case 2:
                        score += 200;
                        break;
                    case 3:
                        score += 300;
                        break;
                    case 4:
                        score += 400;
                        break;
                    case 5:
                        score += 500;
                        break;
                    case 6:
                        score += 600;
                        break;
                }
                counts[i] -= 3;
            }
        }
        score += counts[1] * 100;
        score += counts[5] * 50;

        return score;
    }
}
