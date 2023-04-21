import java.util.Arrays;

public class BucketSort {

    static int[] sort(int[] a){// function to implement bucket sort
        int[] res = Arrays.copyOf(a,a.length);
        int n = res.length;
        int max = UsefulMethods.getMax(res); //max is the maximum element of array
        int[] bucket = new int[max+1];
        for (int i = 0; i <= max; i++)
            bucket[i] = 0;

        for (int i = 0; i < n; i++)
            bucket[res[i]]++;

        for (int i = 0, j = 0; i <= max; i++) {
            while (bucket[i] > 0) {
                res[j++] = i;
                bucket[i]--;
            }
        }
        return res;
    }
}
