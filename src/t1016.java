import java.io.*;
import java.util.StringTokenizer;

public class t1016 {
    static long min;
    static long max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        min = Long.parseLong(st.nextToken());
        max = Long.parseLong(st.nextToken());
        boolean flag[] = new boolean[(int)(max-min+1)];
        int count = 0;
        for(long i = 2 ; i*i <= max ; i++){
            long square = i * i;
            long begin = min + (square - (min % square)) % square;
            for(long j = begin ; j <= max ; j+=square) {
                flag[(int)(j-min)] = true;
            }
        }
        for(int k = 0; k < flag.length; k++) {
            if(!flag[k]) {
                count++;
            }
        }
        bw.write(count+"");
        br.close();
        bw.flush();
        bw.close();
    }
}
