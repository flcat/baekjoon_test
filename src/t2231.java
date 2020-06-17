import java.io.*;

public class t2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(device(n)+"");
        br.close();
        bw.flush();
        bw.close();
    }
    private static int device(int n) {
        int count = 0;

        while(true) {
            int sum = 0;
            count++;
            String sC = String.valueOf(count);
            for (int i = 0; i < sC.length(); i++) {
                sum += sC.charAt(i) - '0';
            }
            sum+=count;
            if (sum == n) {
                return count;
            }
            if (count == n) {
                return 0;
            }
        }
    }
}
