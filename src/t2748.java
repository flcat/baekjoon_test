import java.io.*;

public class t2748 {
    static int n;
    static long d[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        d = new long[n + 1];

        bw.write(dp(n)+"");

        br.close();
        bw.flush();
        bw.close();
    }
    private static long dp(long a) {
        if(n <= 1) return n;
        d[0] = 0;
        d[1] = 1;
        for(int i = 2; i <= a; i++) {
            d[i % 3]= (d[(i - 1) % 3] + d[(i - 2) % 3]);
        }
    return d[n % 3];
    }
}
