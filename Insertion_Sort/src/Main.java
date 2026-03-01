import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Record[] records = new Record[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String grade = st.nextToken();
            records[i] = new Record(name, grade);
        }

        InsertionSort.sort(records);

        for (Record r : records) {
            System.out.println(r.name);
        }
    }
}