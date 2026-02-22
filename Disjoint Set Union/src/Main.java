import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int connections = scanner.nextInt();
        scanner.nextLine();

        // Worst case: 2 new building names per connection
        UnionFind uf = new UnionFind(2 * connections);

        for (int i = 0; i < connections; i++) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split("\\s+");

            String b1 = parts[0];
            String b2 = parts[1];

            System.out.println(uf.union(b1, b2));
        }

        scanner.close();
    }
}