import java.io.*;

public class t10844 {

  static int mod = 1000000000;
  static long[][] arr;
  static long result;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    arr = new long[100][9];

    for (int i = 0; i < 9; i++) {
      arr[0][i] = 1;

      if (i == 8) {
        arr[1][i] = 1;
      } else {
        arr[1][i] = 2;
      }
    }
    dp(N);
    bw.write(result % mod + "");

    br.close();
    bw.flush();
    bw.close();
  }

  private static long dp(int n) {
    result = 0;
    if (n > 2) {
      for (int i = 2; i < n; i++) {
        for (int j = 0; j < 9; j++) {
          if (j == 0) {
            arr[i][j] = (arr[i - 2][j] + arr[i - 1][j + 1] % mod);
          } else if (j == 8) {
            arr[i][j] = (arr[i - 1][j - 1]) % mod;
          } else {
            arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1]) % mod;
          }
        }
      }
    }
    for (int i = 0; i < 9; i++) {
      result += arr[n - 1][i];
    }
    return result;
  }
}
