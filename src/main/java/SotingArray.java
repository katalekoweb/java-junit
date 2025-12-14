import java.util.Arrays;

public class SotingArray {
    public int[] sortingArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public int[] sortingArrayPerfomance(int[] arr) {
        for (int i = 0; i < 10000000; i++) {
            Arrays.sort(arr);
        }
        return arr;
    }
}
