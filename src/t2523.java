import java.io.*;

public class t2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int k = n ; k >= 1 ; k--){
            for(int l = k-1 ; l >= 1 ; l--){
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
