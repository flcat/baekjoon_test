import java.io.*;
import java.util.StringTokenizer;

public class t11053 {

  static int[] arr;
  static int[] d;
  static int answer;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());

    arr = new int[N + 1];
    d = new int[N + 1];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    answer = 0;

    d[0] = 1;
    dp(N);
    bw.write(answer+"");

    br.close();
    bw.flush();
    bw.close();
  }

  private static int dp(int n) {
    for (int i = 1; i < n; i++) {
        d[i] = 1;
      for (int j = 0; j < i; j++) {
        if (arr[j] < arr[i] && d[i] <= d[j]) {
          d[i] = d[j] + 1;
        }
      }
    }
    for (int i : d) {
      answer = Math.max(answer,i);
    }
    return answer;
  }
}
