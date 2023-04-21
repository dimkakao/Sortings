public class UsefulMethods {

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max< array[i]) max = array[i];
        }
        return max;
    }

}
