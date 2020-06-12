import java.io.*;
import java.util.StringTokenizer;

public class t1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        float arr[] = new float[n];
        float m = 0;
        float sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(m < arr[i]) {
                m = arr[i];
            }
        }
        for(int j = 0 ; j < n ; j++) {
            arr[j] = arr[j]/m*100;
            sum+=arr[j];
        }
        br.close();
        bw.write(String.valueOf(sum/n));
        bw.flush();
        bw.close();
    }
}
