public class BSTMap {
    private static class Node {
        String key;
        String value;
        Node left, right;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    public void put(String key, String value) {
        root = put(root, key, value);
    }

    private Node put(Node x, String key, String value) {
        if (x == null) return new Node(key, value);

        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;

        return x;
    }

    public String getOrDefault(String key, String def) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) x = x.left;
            else if (cmp > 0) x = x.right;
            else return x.value;
        }
        return def;
    }

    public void remove(String key) {
        root = remove(root, key);
    }

    private Node remove(Node x, String key) {
        if (x == null) return null;

        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = remove(x.left, key);
        else if (cmp > 0) x.right = remove(x.right, key);
        else {
            if (x.left == null) return x.right;
            if (x.right == null) return x.left;

            Node succ = min(x.right);
            x.key = succ.key;
            x.value = succ.value;
            x.right = deleteMin(x.right);
        }
        return x;
    }

    private Node min(Node x) {
        while (x.left != null) x = x.left;
        return x;
    }

    private Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        x.left = deleteMin(x.left);
        return x;
    }

    public String ceilingKey(String key) {
        Node x = root;
        String candidate = null;

        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp == 0) return x.key;
            if (cmp < 0) {
                candidate = x.key;
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return candidate;
    }

    public int countInRange(String lo, String hi) {
        return countInRange(root, lo, hi);
    }

    private int countInRange(Node x, String lo, String hi) {
        if (x == null) return 0;

        int cmpLo = lo.compareTo(x.key);
        int cmpHi = hi.compareTo(x.key);

        if (cmpLo <= 0 && cmpHi >= 0) {
            return 1 + countInRange(x.left, lo, hi) + countInRange(x.right, lo, hi);
        } else if (cmpHi < 0) {
            return countInRange(x.left, lo, hi);
        } else {
            return countInRange(x.right, lo, hi);
        }
    }
}