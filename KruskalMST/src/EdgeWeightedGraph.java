import java.util.*;
public class EdgeWeightedGraph {
    private final int V;                    // number of vertices
    private final List<List<Edge>> adj;     

    public EdgeWeightedGraph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public int V() {
        return V;
    }


    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        adj.get(v).add(e);
        adj.get(w).add(e);
    }


    public Iterable<Edge> edges() {
        List<Edge> list = new ArrayList<>();
        for (int v = 0; v < V; v++) {
            for (Edge e : adj.get(v)) {
                if (e.other(v) >= v) {   // collect each edge only once
                    list.add(e);
                }
            }
        }
        return list;
    }
}
