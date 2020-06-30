import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class t1365 {
    static int n;
    static int uPole[];
    static int tree[];
    static int max = 100001;
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer st;

         n = Integer.parseInt(br.readLine());

         uPole = new int[max];
         tree = new int[max*4];

         st = new StringTokenizer(br.readLine());
         for(int i = 0; i < n; i++) {
             uPole[i] = Integer.parseInt(st.nextToken());
             uPole[i] = i;
         }

         for(int i = 0; i < n; i++) {
             bw.write(uPole[i]+"");
         }

         br.close();
         bw.flush();
         bw.close();
    }
    private static int Segment(int uPole) {

        return 0;
    }
    private static int sum(int L,int R,int nodeNum,int nodeL,int nodeR) {
        if(R < nodeL || nodeR < L) return 0;
        if(L <= nodeL && nodeR <= R) return uPole[nodeNum];

    }
}
