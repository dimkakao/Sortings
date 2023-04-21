
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        long start, finish;
        int[] array = new int[size];
        int[] arraySort;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10000);
        }

        //Counting sort
        arraySort = array;
        //System.out.println("Before: " + Arrays.toString(arraySort));
        start = System.currentTimeMillis();
        arraySort = CountingSort.sort(arraySort);
        finish = System.currentTimeMillis();
        //System.out.println("After: " + Arrays.toString(arraySort));
        System.out.println("Time: " + (finish - start));

        //Radix Sort
        arraySort = array;
        //System.out.println("Before: " + Arrays.toString(arraySort));
        start = System.currentTimeMillis();
        arraySort = RadixSort.sort(arraySort);
        finish = System.currentTimeMillis();
        //System.out.println("After: " + Arrays.toString(arraySort));
        System.out.println("Time: " + (finish - start));

        //Bucket Sort
        arraySort = array;
        //System.out.println("Before: " + Arrays.toString(arraySort));
        start = System.currentTimeMillis();
        arraySort = BucketSort.sort(arraySort);
        finish = System.currentTimeMillis();
        //System.out.println("After: " + Arrays.toString(arraySort));
        System.out.println("Time: " + (finish - start));
    }
}