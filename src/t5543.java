import java.io.*;
import java.util.Arrays;

public class t5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr1 = new int[3];
        int[] arr2 = new int[2];

        for(int i = 0 ; i <= 2 ; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        for(int j = 0 ; j <= 1 ; j++){
            arr2[j] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        br.close();
        bw.write(String.valueOf((arr1[0]+arr2[0])-50));
        bw.flush();
        bw.close();
    }
}
