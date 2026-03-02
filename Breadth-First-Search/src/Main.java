import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        Graph graph = new Graph(n);

        for (int i = 0; i < m; i++) {
            String[] edgeData = br.readLine().split(" ");
            int u = Integer.parseInt(edgeData[0]);
            int v = Integer.parseInt(edgeData[1]);
            int c = Integer.parseInt(edgeData[2]);
            graph.addEdge(u, v, c);
        }

        System.out.println(graph.isBipartite() ? "1" : "0");
    }
}