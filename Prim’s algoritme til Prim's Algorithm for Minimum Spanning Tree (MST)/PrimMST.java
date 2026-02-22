import java.util.*;

public class PrimMST {
    private Edge[] edgeTo;
    private double[] distTo;
    private boolean[] marked;
    private PriorityQueue<Integer> pq;
    private int[] pqIndex;
    private final EdgeWeightedGraph G;

    public PrimMST(EdgeWeightedGraph G) {
        this.G = G;
        int V = G.V();
        edgeTo = new Edge[V];
        distTo = new double[V];
        marked = new boolean[V];
        pq = new PriorityQueue<>(Comparator.comparingDouble(v -> distTo[v]));
        pqIndex = new int[V];

        Arrays.fill(distTo, Double.POSITIVE_INFINITY);
        distTo[0] = 0.0;
        pq.add(0);

        while (!pq.isEmpty()) {
            int v = pq.poll();
            scan(v);
        }
    }

    private void scan(int v) {
        marked[v] = true;
        for (Edge e : G.adj(v)) {
            int w = e.other(v);
            if (marked[w]) continue;
            if (e.weight() < distTo[w]) {
                distTo[w] = e.weight();
                edgeTo[w] = e;
                pq.remove(w);
                pq.add(w);
            }
        }
    }

    public Iterable<Edge> edges() {
        List<Edge> mst = new ArrayList<>();
        for (Edge e : edgeTo)
            if (e != null) mst.add(e);
        return mst;
    }

    public double weight() {
        double total = 0.0;
        for (Edge e : edges())
            total += e.weight();
        return total;
    }
}