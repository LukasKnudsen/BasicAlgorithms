import java.util.*;

class Graph {
    private final int n;
    private final List<List<int[]>> adj;
    private final int[] color;

    public Graph(int n) {
        this.n = n;
        this.adj = new ArrayList<>();
        this.color = new int[n];
        Arrays.fill(color, -1); // unvisited

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int type) {
        adj.get(u).add(new int[]{v, type});
        adj.get(v).add(new int[]{u, type});
    }

    public boolean isBipartite() {
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!bfsCheck(i)) return false;
            }
        }
        return true;
    }

    private boolean bfsCheck(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int[] neighbor : adj.get(node)) {
                int nextNode = neighbor[0];
                int edgeType = neighbor[1];

                int expectedColor =
                        (edgeType == 1) ? (1 - color[node]) : color[node];

                if (color[nextNode] == -1) {
                    color[nextNode] = expectedColor;
                    queue.add(nextNode);
                } else if (color[nextNode] != expectedColor) {
                    return false;
                }
            }
        }
        return true;
    }
}