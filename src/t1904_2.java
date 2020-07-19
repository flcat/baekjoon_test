import java.io.*;

public class t1904_2 {

  static final int mod = 15746;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    long[][] arr = dp(N);
    long[][] arr2 = dp(N + 1);

    bw.write((arr[0][1] * arr2[0][1]) % mod + "");

    br.close();
    bw.flush();
    bw.close();
  }
  private static long[][] squared(long[][] a, long[][] b) {
    int h = a.length;
    long[][] c = new long[h][h];
    for (int i = 0; i < h; i++) {
      for(int j = 0; j < h; j++) {
        for(int k = 0; k < h; k++) {
          c[i][j] += (a[j][k] % mod) * (b[k][i] % mod);
          c[i][j] %= mod;
        }
      }
    }
    return c;
  }

  private static long[][] dp(long n) {
    long[][] begin = new long[][]{{0, 0}, {0, 1}};
    long[][] matrix = new long[][]{{0, 0}, {1, 0}};
    while (n > 0) {
      if (n == 0) {
        begin = new long[][]{{1, 0}, {0, 1}};
      } else {
        begin = squared(begin, matrix);
        matrix = squared(begin, begin);
        if (n % 2 == 1) {
          begin = squared(matrix, begin);
        }
      }
      n /= 2;
    }
    return begin;
  }
}