import java.io.*;

public class t1904 {

  static final int mod = 15746;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[1000001];

    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;

    for (int i = 3; i <= n; i++) {
      arr[i] = (arr[i - 1] + arr[i - 2]) % mod;
    }

    bw.write(arr[n - 1] + "");

    br.close();
    bw.flush();
    bw.close();
  }
}
