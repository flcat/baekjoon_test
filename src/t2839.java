import java.io.*;

public class t2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while(true){
            if(n % 5 == 0) {
                bw.write(n/5+count+"");
                break;
            } else if(n <= 0) {
                bw.write(-1+"");
                break;
            }
            n = n-3;
            count++;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
