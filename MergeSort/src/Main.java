import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        MergeSort.sort(arr);

        System.out.println("After MergeSort:");
        System.out.println(Arrays.toString(arr));
    }
}