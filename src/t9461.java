import java.io.*;

public class t9461 {

  static long[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    arr = new long[101];

    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 1;
    arr[4] = 2;
    arr[5] = 2;

    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      bw.write(dp(N) + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }

  private static long dp(int a) {
    for (int i = 6; i <= a; i++) {
      arr[i] = arr[i - 1] + arr[i - 5];
    }
    return arr[a];
  }
}
