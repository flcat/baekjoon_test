import java.io.*;

public class t2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <= n ; i++) {
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
