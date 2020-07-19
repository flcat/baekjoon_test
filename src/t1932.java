import java.io.*;
import java.util.StringTokenizer;

public class t1932 {
  static int[][] triangle;
  static BufferedReader br;
  static BufferedWriter bw;
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    triangle = new int[N + 1][N + 1];

    triangle[0][0] = Integer.parseInt(br.readLine());

    bw.write(dp(N)+"");

    br.close();
    bw.flush();
    bw.close();
  }
  private static int dp(int n) throws IOException {
    int max = 0;
    for(int i = 1; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j <= i; j++) {
        triangle[i][j] = Integer.parseInt(st.nextToken());

        if(j == 0)
          triangle[i][j] += triangle[i - 1][j];
        else if(j == i)
          triangle[i][j] += triangle[i - 1][j - 1];
        else
          triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);

        max = Math.max(max, triangle[i][j]);

      }
    }
    return max;
  }
}
