import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class t11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int sum = 0;
        int ans = 0;
            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0 ; i < n ; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        Arrays.sort(arr);
            for(int j = 0 ; j < n ; j++) {
                sum+=arr[j];
                ans+=sum;
            }
            bw.write(ans+"");
            br.close();
            bw.flush();
            bw.close();
    }
}
