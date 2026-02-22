import java.util.*;

public class EdgeWeightedGraph {
    private final int V;
    private final List<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        adj = new List[V];
        for (int v = 0; v < V; v++) adj[v] = new ArrayList<>();
    }

    public void addEdge(Edge e) {
        int v = e.either(), w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
    }

    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    }

    public Iterable<Edge> edges() {
        Set<Edge> edgeSet = new HashSet<>();
        for (int v = 0; v < V; v++)
            for (Edge e : adj[v])
                if (e.other(v) > v) edgeSet.add(e);
        return edgeSet;
    }
}
