import java.io.*;

public class t2579 {
  static int[] stairs;
  static int[] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    stairs = new int[301];
    arr = new int[301];

    for(int i = 1; i <= T; i++) {
      stairs[i] = Integer.parseInt(br.readLine());
    }
    arr[0] = stairs[0];
    arr[1] = stairs[1];
    arr[2] = stairs[2] + stairs[1];

    bw.write(dp(T)+"");

    br.close();
    bw.flush();
    bw.close();
  }
  private static int dp(int t) {
    arr[3] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);
    for(int i = 4; i <= t; i++) {
      arr[i] = Math.max(arr[i - 3] + stairs[i] + stairs[i - 1], arr[i - 2] + stairs[i]);
    }
    return arr[t];
  }
}
