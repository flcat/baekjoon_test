import java.io.*;
import java.util.StringTokenizer;

public class t1365 {
    static int n;
    static int uPole;
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer st;

         n = Integer.parseInt(br.readLine());

         st = new StringTokenizer(br.readLine());
         uPole = Integer.parseInt(st.nextToken());

         

         br.close();
         bw.flush();
         bw.close();
    }
}
