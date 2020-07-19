import java.io.*;
import java.util.StringTokenizer;

public class t1149 {
  static int[][] houses;
  static int[][] arr;
  static int N;
  static int min;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    N = Integer.parseInt(br.readLine());

    houses = new int[N + 1][3];
    arr = new int[N + 1][3];
    min = 0;
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < 3; j++) {
        houses[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    arr[0][0] = houses[0][0];
    arr[0][1] = houses[0][1];
    arr[0][2] = houses[0][2];

    dp();

    bw.write(min+"");

    br.close();
    bw.flush();
    bw.close();
  }
  private static void dp() {
      for(int i = 1; i < N; i++) {
        houses[i][0] += Math.min(houses[i - 1][1],houses[i - 1][2]) + arr[i][0];
        houses[i][1] += Math.min(houses[i - 1][0],houses[i - 1][2]) + arr[i][1];
        houses[i][2] += Math.min(houses[i - 1][0],houses[i - 1][1]) + arr[i][2];
      }
      min = Math.min(Math.min(houses[N - 1][0],houses[N - 1][1]),houses[N - 1][2]);
  }
}
