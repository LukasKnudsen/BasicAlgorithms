import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];

        int idx = 0;
        while (idx < n) {
            String line = br.readLine();
            if (line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens() && idx < n) {
                a[idx++] = Integer.parseInt(st.nextToken());
            }
        }

        QuickSort.sort(a);

        StringBuilder out = new StringBuilder();
        for (int x : a) out.append(x).append('\n');
        System.out.print(out);
    }
}