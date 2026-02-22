import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        br.readLine(); // skip blank line

        for (int c = 0; c < cases; c++) {
            if (c > 0) System.out.println();

            int n = Integer.parseInt(br.readLine());
            double[][] points = new double[n][2];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                points[i][0] = Double.parseDouble(st.nextToken());
                points[i][1] = Double.parseDouble(st.nextToken());
            }

            if (c < cases - 1) br.readLine(); // skip blank line

            EdgeWeightedGraph graph = new EdgeWeightedGraph(n);
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    double dx = points[i][0] - points[j][0];
                    double dy = points[i][1] - points[j][1];
                    double dist = Math.hypot(dx, dy);
                    graph.addEdge(new Edge(i, j, dist));
                }
            }

            PrimMST mst = new PrimMST(graph);
            System.out.printf("%.2f%n", mst.weight());
        }
    }
}
