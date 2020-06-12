import java.io.*;
import java.util.StringTokenizer;

public class t2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        int min = 0;
        int sum = 0;
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                for(int k = 0 ; k < n ; k++) {
                 sum = arr[i]+arr[j]+arr[k];
                 if(sum >= min && i!=j && i!=k && j!=k && sum <= m) {
                     min = sum;
                 }
                }
            }
        }
        bw.write(min+"");
        br.close();
        bw.flush();
        bw.close();
    }
}
