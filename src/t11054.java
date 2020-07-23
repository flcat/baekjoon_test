import java.io.*;
import java.util.StringTokenizer;

public class t11054 {
  static int[] arr;
  static int[][] d;
  static int answer = Integer.MAX_VALUE;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());

    arr = new int[N + 1];
    d = new int[2][N + 1];

    answer = 0;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    d[1][N] = 1;
    d[0][1] = 1;

    dp(N);
    bw.write(answer - 1+"");

    br.close();
    bw.flush();
    bw.close();
  }
  private static int dp(int n) {
    for (int i = n - 1; i >= 0; i--) {
      d[1][i] = 1;
      for (int j = n - 1; j >= i; j--) {
        if(arr[j] < arr[i]) {
          d[1][i] = Math.max(d[1][i], d[1][j] + 1);
        }
      }
    }
    for (int i = 0; i < n; i++) {
      d[0][i] = 1;
      for (int j = 0; j <= i; j++) {
        if (arr[j] < arr[i]) {
          d[0][i] = Math.max(d[0][i], d[0][j] + 1);
        }
      }
    }
    for (int i = 1;i <= n; i++) {
      d[0][i] += d[1][i];
    }
    for (int i = 1;i <= n; i++) {
      if (d[0][i] > answer) {
        answer = d[0][i];
      }
    }
    return answer;
  }
}
