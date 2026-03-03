public class QuickSort {

    public static void sort(int[] a) {
        if (a == null || a.length < 2) return;
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int[] a, int lo, int hi) {
        if (lo >= hi) return;

        int p = partition(a, lo, hi);
        quicksort(a, lo, p - 1);
        quicksort(a, p + 1, hi);
    }

    private static int partition(int[] a, int lo, int hi) {
        int pivotIndex = medianOfThreeIndex(a, lo, hi);
        swap(a, pivotIndex, hi);

        int pivot = a[hi];
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (a[j] <= pivot) {
                swap(a, i, j);
                i++;
            }
        }

        swap(a, i, hi);
        return i;
    }

    private static int medianOfThreeIndex(int[] a, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;

        int x = a[lo], y = a[mid], z = a[hi];

        if ((x <= y && y <= z) || (z <= y && y <= x)) return mid;
        if ((y <= x && x <= z) || (z <= x && x <= y)) return lo;
        return hi;
    }

    private static void swap(int[] a, int i, int j) {
        if (i == j) return;
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}