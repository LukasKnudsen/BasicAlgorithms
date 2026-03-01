import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();   // number of groups
        int k = input.nextInt();   // number of units to allocate

        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = input.nextInt();
        }

        int[] allocation = HighestAverages.allocate(weights, k);

        for (int x : allocation) {
            System.out.println(x);
        }

        input.close();
    }
}