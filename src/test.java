import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {
    static int n;
    static long a, b, c;
    static long s[] = new long[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            //st = new StringTokenizer(br.readLine());
            s[i] = Integer.parseInt(st.nextToken());
            s[i] += s[i - 1];
        }

        bw.write(" "+s[0]);

        //bw.write(solve()+"");

        br.close();
        bw.flush();
        bw.close();
    }
}