import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BSTMap st = new BSTMap();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = reader.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        for (int i = 0; i < n; i++) {
            String[] pair = reader.readLine().split(" ");
            st.put(pair[0], pair[1]);
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String[] cmd = reader.readLine().split(" ");
            String op = cmd[0];

            switch (op) {
                case "cancel":
                    st.remove(cmd[1]);
                    break;

                case "reroute":
                    st.put(cmd[1], cmd[2]);
                    break;

                case "destination":
                    output.append(st.getOrDefault(cmd[1], "-")).append("\n");
                    break;

                case "next": {
                    String nextKey = st.ceilingKey(cmd[1]);
                    if (nextKey == null) output.append("-\n");
                    else output.append(nextKey).append(" ")
                               .append(st.getOrDefault(nextKey, "-"))
                               .append("\n");
                    break;
                }

                case "count":
                    output.append(st.countInRange(cmd[1], cmd[2])).append("\n");
                    break;

            }
        }

        System.out.print(output);
    }
}