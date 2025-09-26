import java.util.Arrays;

public class Kata {
    public static String highAndLow(String numbers) {
    String[] split = numbers.split(" ");

    int[] numb = new int[split.length];
    for (int i = 0; i < split.length; i++) {
        numb[i] = Integer.parseInt(split[i]);
     }
    Arrays.sort(numb);

    int lowest = numb[0];
    int highest = numb[numb.length - 1];
    
    return highest + " " + lowest;
    }
}
