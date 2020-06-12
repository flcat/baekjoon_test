import java.io.*;

public class t1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if(n <= 99) {
            bw.write(n+"\n");
        } else {
            int x = 99;

            for(int i = 100; i <= n ; i++){
                x+=han(i);
            }
            if(n==1000) { x--;}
            bw.write(x+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static int han(int num) {
        int num1 = num / 100 % 10;
        int num2 = num / 10 % 10;
        int num3 = num % 10;

        if(num2 * 2 == num1+num3) {
            return 1;
        }

        return 0;
    }
}
