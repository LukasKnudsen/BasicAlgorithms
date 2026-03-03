public class InsertionSort {

    public static void sort(Record[] a) {
        for (int i = 1; i < a.length; i++) {
            Record key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j].compareTo(key) > 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}