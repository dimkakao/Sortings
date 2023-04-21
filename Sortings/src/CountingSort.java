public class CountingSort {


    public static int[] sort(int [] array){
        int max = UsefulMethods.getMax(array);

        int[] countValues = new int[max+1];

        for (int k : array) {
            countValues[k]++;
        }

        for (int i = 1; i < countValues.length; i++) {
            countValues[i] += countValues[i-1];
        }

        int[] result = new int[array.length];

        for (int j : array) {
            result[countValues[j] - 1] = j;
            countValues[j]--;
        }

//        for (int i = array.length - 1; i >= 0; i--) {
//            result[countValues[array[i]] - 1] = array[i];
//            countValues[array[i]]--; // decrease count for same numbers
//        }

        return result;
    }
}
