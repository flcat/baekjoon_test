import java.io.*;

public class t2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = n ; i >= 1 ; i--){
            for(int j = i-1 ; j >= 1 ; j--) {
                bw.write(" ");
            }
            for(int k = n ; k >= i ; k--) {
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
