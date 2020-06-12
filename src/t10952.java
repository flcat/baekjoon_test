import java.io.*;
import java.util.StringTokenizer;

public class t10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        boolean flag = true;
        while (flag) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0&&b == 0) {
                flag = false;
            }
            if(a+b!=0) {
                bw.write(String.valueOf(a + b) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
