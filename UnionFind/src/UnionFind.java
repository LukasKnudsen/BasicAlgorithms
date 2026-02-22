import java.util.HashMap;
import java.util.Map;

public class UnionFind {
    private final int[] parent;
    private final int[] size;

    private int nextIndex = 0;
    private final Map<String, Integer> nameToIndex = new HashMap<>();

    public UnionFind(int maxElements) {
        parent = new int[maxElements];
        size = new int[maxElements];

        for (int i = 0; i < maxElements; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    private int idOf(String name) {
        Integer existing = nameToIndex.get(name);
        if (existing != null) return existing;

        int id = nextIndex++;
        nameToIndex.put(name, id);
        return id;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); 
        }
        return parent[x];
    }

    public int union(String a, String b) {
        int idA = idOf(a);
        int idB = idOf(b);

        int rootA = find(idA);
        int rootB = find(idB);

        if (rootA == rootB) {
            return size[rootA];
        }

        if (size[rootA] < size[rootB]) {
            int tmp = rootA;
            rootA = rootB;
            rootB = tmp;
        }

        parent[rootB] = rootA;
        size[rootA] += size[rootB];
        return size[rootA];
    }
}