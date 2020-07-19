import java.io.*;

public class t2156 {

  static int[] arrWine;
  static int[] amount;

  static BufferedWriter bw;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    amount = new int[N + 1];
    arrWine = new int[N + 1];

    for (int i = 0; i < N; i++) {
      amount[i] = Integer.parseInt(br.readLine());
    }

    dp(N);

    br.close();
    bw.flush();
    bw.close();
  }

  private static void dp(int n) throws IOException {
    if (n == 1) {
      bw.write(amount[0]+"");

    } else if (n == 2) {
      bw.write(amount[0] + amount[1]+"");

    } else {
      arrWine[0] = amount[0];
      arrWine[1] = arrWine[0] + amount[1];
      arrWine[2] = Math.max(arrWine[1], Math.max(amount[0] + amount[2], amount[1] + amount[2]));

      for (int i = 3; i < n; i++) {
        arrWine[i] = Math.max(arrWine[i - 3] + amount[i] + amount[i - 1], arrWine[i - 2] + amount[i]);
        arrWine[i] = Math.max(arrWine[i - 1], arrWine[i]);
      }
      bw.write(arrWine[n - 1]+"");
    }
  }
}
