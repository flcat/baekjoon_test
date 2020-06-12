import java.io.*;
import java.util.StringTokenizer;

public class t1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        if(c <= b) {
            bw.write(String.valueOf(-1));
        } else {
            bw.write(String.valueOf((a / (c - b) + 1)));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
