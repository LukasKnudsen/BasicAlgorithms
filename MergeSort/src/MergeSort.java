public class MergeSort {

    public static void sort(int[] a) {
        if (a == null || a.length < 2) return;
        int[] aux = new int[a.length];
        mergesort(a, aux, 0, a.length - 1);
    }

    private static void mergesort(int[] a, int[] aux, int lo, int hi) {
        if (lo >= hi) return;

        int mid = lo + (hi - lo) / 2;
        mergesort(a, aux, lo, mid);
        mergesort(a, aux, mid + 1, hi);

        if (a[mid] <= a[mid + 1]) return;

        merge(a, aux, lo, mid, hi);
    }

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;       // pointer left 
        int j = mid + 1;  // pointer right 

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}