import java.io.*;

public class t2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        bw.write(way(n)+"");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long way(long n) {
        if(n == 1) return 1;
        long i=2;
        long j=1;
        while(i<=n) {
            i += 6*j++;
        }
        return j;
    }
}
