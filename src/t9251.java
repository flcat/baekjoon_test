import java.io.*;

public class t9251 {
  static int[][] arr;
  static String st1;
  static String st2;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    st1 = br.readLine();
    st2 = br.readLine();

    arr = new int[st1.length() + 1][st2.length() + 1];

    dp();

    bw.write(arr[st1.length()][st2.length()]+"");

    br.close();
    bw.flush();
    bw.close();
  }
  private static void dp() {
    for (int i = 1; i <= st1.length(); i++) {
      for (int j = 1; j <= st2.length(); j++) {
        if (st1.charAt(i - 1) != st2.charAt(j - 1)) {
          arr[i][j] = Math.max(arr[i][j - 1],arr[i - 1][j]);
        } else {
          arr[i][j] = arr[i - 1][j - 1] + 1;
        }
      }
    }
  }
}
