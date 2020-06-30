import java.io.*;

public class t1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Short.parseShort(br.readLine());
        int count = 1;
        int num = 666;

        while(n != count) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }

        bw.write(num+"");
        br.close();
        bw.flush();
        bw.close();
    }
}
