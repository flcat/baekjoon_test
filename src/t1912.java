import java.io.*;
import java.util.StringTokenizer;

public class t1912 {
  static int[] arr;
  static int[] d;
  static int answer;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
    StringTokenizer st;
    
    int N = Integer.parseInt(br.readLine());

    arr = new int[N + 1];
    d = new int[N + 1];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    d[0] = arr[0];
    answer = arr[0];

    dp(N);

    bw.write(answer+"");

    br.close();
    bw.flush();
    bw.close();
  }
  private static void dp(int n) {
    for (int i = 1; i < n; i++) {
      d[i] = Math.max(d[i - 1] + arr[i], arr[i]);

      answer = Math.max(answer, d[i]);
    }
  }
}
