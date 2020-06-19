import java.io.*;
import java.util.*;

public class t12724 {
    static int T;
    static int N;
    static LinkedList<Long> v1;
    static LinkedList<Long> v2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());


        for(int i = 0 ; i < T ; i++ ) {
            N = Integer.parseInt(br.readLine());
            v1 = new LinkedList<>();
            v2 = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                v1.add(Long.valueOf(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                v2.add(Long.valueOf(st.nextToken()));
            }
            bw.write("Case #" + String.valueOf(i+1) +": "+ minScalaValue(v1, v2)+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
    private static long minScalaValue(LinkedList<Long> a,LinkedList<Long> b) {
        long sum = 0;

        Collections.sort(a);
        Collections.sort(b);
        int i = 0;
        int j = b.size()-1;
        while (i < a.size()) {
            long valueA = a.get(i++);
            long valueB = b.get(j--);
            sum += valueA * valueB;
        }
        return sum;
    }
}