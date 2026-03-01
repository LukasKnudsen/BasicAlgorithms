public class HighestAverages {
    public static int[] allocate(int[] weights, int k) {
        int n = weights.length;
        int[] alloc = new int[n];

        for (int step = 0; step < k; step++) {
            int bestIndex = 0;
            double bestQuotient = -1;

            for (int i = 0; i < n; i++) {
                double q = (double) weights[i] / (alloc[i] + 1);
                if (q > bestQuotient) {
                    bestQuotient = q;
                    bestIndex = i;
                }
            }

            alloc[bestIndex]++;
        }

        return alloc;
    }
}