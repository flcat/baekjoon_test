import java.io.*;

public class t11440 {
    static final long mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long[][] answer1 = f(n);
        long[][] answer2 = f(n+1);

        bw.write((answer1[0][1] % mod) * (answer2[0][1] % mod) +"");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long[][] squared(long[][] a,long[][] b) {
        int h = a.length;
        long[][] c = new long[h][h];
        for(int i= 0; i < h; i++) {
            for(int j = 0; j < h; j++) {
                for(int k = 0; k < h; k++) {
                    c[i][j] += (a[j][k]% mod) * (b[k][i] % mod);
                    c[i][j] %= mod;
                }
            }
        }
        return c;
    }
    private static long[][] f (long n) {
        long[][] begin = new long[][]{{1, 0}, {0, 1}};
        long[][] matrix = new long[][]{{1, 1}, {1,0}};
        while (n > 0) {
            if(n % 2 == 1) begin = squared(begin, matrix);
            matrix = squared(matrix, matrix);
            n /= 2;
        }
        return begin;
    }
}
