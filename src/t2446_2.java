import java.io.*;

public class t2446_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i <= n ; i++) {
            for(int j = 0 ; j < i ; j++) {
                bw.write(" ");
            }

            for(int k = n-i  ; k >= 0 ; k-- ){
                for(int l = 0;l < n/5 ; l++) {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
