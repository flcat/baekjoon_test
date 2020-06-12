import java.io.*;
import java.util.StringTokenizer;

public class t10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        int t = Integer.parseInt(br.readLine());


        for(int i=0;i<=t-1;i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b+"\n");
        }
        br.close();
        System.out.println(sb);

    }
}
