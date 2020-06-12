import java.io.*;
import java.util.StringTokenizer;

public class t10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i < n ; i++ ) {

            int a = Integer.parseInt(st.nextToken());

            if(a < x) {
                bw.write(a+" ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
