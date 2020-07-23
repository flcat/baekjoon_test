import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class t2565 {
  static int[][] arr;
  static int[] d;
  static int setup;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());

    arr = new int[N + 1][2];
    d = new int[N + 1];
    setup = 1;

    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    });

    dp(N);

    bw.write(N - setup+"");

    br.close();
    bw.flush();
    bw.close();
  }
  private static void dp(int n) {
    for (int i = 1; i <= n; i++) {
      d[i] = 1;
      for (int j = 1; j < i; j++) {
        if(arr[j][1] < arr[i][1] && d[i] < d[j] + 1) {
          d[i] = d[j] + 1;
        }
      }
      setup = Math.max(setup, d[i]);
    }
  }
}
