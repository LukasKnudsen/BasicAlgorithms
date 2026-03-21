import java.util.*;

public class KruskalMST {
    private List<Edge> mst;
    private double weight;

    public KruskalMST(EdgeWeightedGraph G) {
        mst = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();

        for (Edge e : G.edges()) {
            edges.add(e);
        }

        Collections.sort(edges);

        UnionFind uf = new UnionFind(G.V());

        for (Edge e : edges) {
            int v = e.either();
            int w = e.other(v);

            if (!uf.connected(v, w)) {
                uf.union(v, w);
                mst.add(e);
                weight += e.weight();

                if (mst.size() == G.V() - 1) break;
            }
        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }

    public double weight() {
        return weight;
    }
}