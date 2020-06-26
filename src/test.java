import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long x = 1;
        int count = 0;
        for(long i = n ; i <= m ; i++) {
            double a = (x = (x + (i / x)) / 2) ;
            if(i != a*a) {
                count++;
            }
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}