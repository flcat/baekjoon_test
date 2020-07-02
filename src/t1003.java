import java.io.*;
public class t1003 {
    static int countZ;
    static int countO;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int seq[] = new int[t * 2];

        for(int i = 0; i < t; i++) {
            countZ = 0;
            countO = 0;

            int n = Integer.parseInt(br.readLine());

            fibonacci(n);

            seq[i * 2] = countZ;
            seq[i * 2 + 1] = countO;
        }
        for(int i = 0; i < t ; i++) {
            bw.write(seq[i * 2]+" "+seq[i * 2 + 1]+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
    private static int fibonacci(int a) {
        if (a == 0) {
            countZ++;
            return 0;
        } else if (a == 1) {
            countO++;
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
}
