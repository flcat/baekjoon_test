import java.io.*;
import java.util.*;

public class t4008 {
    static int n;
    static Set<Integer> result;
    static int abc[];
    static int x[];
    static Stack<Integer> select;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st;

            n = Integer.parseInt(br.readLine());

            x = new int[n];
            abc = new int[4];
            result = new HashSet<>();

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n-1; i++) {
                abc[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                x[i] = Integer.parseInt(st.nextToken());
            }

            select = new Stack<>();
            dfs(0);

            int min = Collections.min(result);
            int max = Collections.max(result);

            bw.write(max - min + "");

            br.close();
            bw.flush();
            bw.close();
    }

    private static void dfs(int a) {
        if(a == n-1) {
            result.add(solve());
        }

        for(int i = 0 ; i < n-1 ; i++) {
            if(abc[i] > 0) {
                select.push(i);
                abc[i] -= 1;
                dfs(a+1);
                abc[i] += 1;
                select.pop();
            }
        }
    }

    private static int solve() {
        int result = x[0];

        for(int i = 0 ; i < select.size() ; i++) {
            switch (select.get(i)) {
                case 0:
                    result += x[i+1];
                    break;
                case 1:
                    result -= x[i+1];
                    break;
                case 2:
                    result *= x[i+1];
                    break;
                case 3:
                    result /= x[i+1];
                    break;           }
        }

        return result;
    }
}
