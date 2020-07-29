import java.io.*;
import java.util.StringTokenizer;

public class t12865 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int W = Integer.parseInt(st.nextToken());
      int V = Integer.parseInt(st.nextToken());
    }


    br.close();
    bw.flush();
    bw.close();
  }
  private static void dp() {

  }
}
