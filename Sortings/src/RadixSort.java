import java.util.Arrays;
public class RadixSort {

    public static int[] sort(int[]array){
        int max = UsefulMethods.getMax(array);

        int[] result = Arrays.copyOf(array,array.length);
        for (int place = 1; max / place > 0; place *= 10)
            result = countingSort(result, place);
        return result;
    }

    private static int[] countingSort(int[] array, int place){

        int[] counting = new int[10];
        int[] result = new int[array.length];

        for (int j : array)
            counting[j / place % 10]++;

        for (int i = 1; i < counting.length; i++)
            counting[i] += counting[i-1];

        for (int i = array.length - 1; i >= 0; i--) {
            result[counting[(array[i] / place) % 10] - 1] = array[i];
            counting[(array[i] / place) % 10]--;
        }
        return result;
    }
}
