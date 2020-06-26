import java.io.*;
import java.util.StringTokenizer;

public class t1016_2 {
    static long min;
    static long max;
    static boolean flag[];
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        min = Long.parseLong(st.nextToken());
        max = Long.parseLong(st.nextToken());
        flag = new boolean[(int)(max-min+1)];
        count = 0;

        linearSieve(max,min);

        bw.write(count+"");
        br.close();
        bw.flush();
        bw.close();
    }
    private static void linearSieve(long max,long min) {
        for(long i = 2; i < flag.length ; i++) {
            if(!flag[(int) i]) {
                count++;
            }
            long square = i*i;
            long begin = min + (square - (min % square)) % square;
            for(long j = begin; j <= flag.length && j - min <= max; j+=square) {
                flag[(int) (j-min)] = true;
                if(i % j == 0) { break; }
            }
        }
    }
}
