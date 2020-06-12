import java.io.*;
import java.util.Arrays;

public class t10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];

        for(int i=0; i <= 2 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arr);
        bw.write(String.valueOf(arr[arr.length-2]));
        bw.flush();
        bw.close();
    }
}
