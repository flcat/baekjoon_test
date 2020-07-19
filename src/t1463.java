import java.io.*;

public class t1463 {
  static int[] d;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    d = new int[N + 1];

    d[0] = 0;
    d[1] = 0;

    dp(N);

    bw.write(d[N] + "");

    br.close();
    bw.flush();
    bw.close();
  }
  private static int dp(int n) {
    for (int i = 2; i <= n; i++) {
      d[i] = d[i - 1] + 1;
      if (i % 2 == 0) {
        d[i] = Math.min(d[i], d[i / 2] + 1);
      }
      if (i % 3 == 0) {
        d[i] = Math.min(d[i], d[i / 3] + 1);
      }
    }
    return n;
  }
}
