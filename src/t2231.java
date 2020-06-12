import java.io.*;

public class t2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[String.valueOf(n).length()];
        int tmp = 1;
        for(int i = 0 ; i < String.valueOf(n).length() ; i++) {
            arr[i] = n%(10*tmp)/tmp;
            tmp*=10;
            bw.write(arr[i]+" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
