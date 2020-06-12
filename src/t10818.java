import java.io.*;
import java.util.StringTokenizer;

public class t10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -1000000;
        int min = 1000000;

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] >= max ) {
                max = arr[i];
            }
            if(arr[i] <= min) {
                min = arr[i];
            }
        }
        br.close();
        bw.write(min+" "+max);
        bw.flush();
        bw.close();
    }
}
