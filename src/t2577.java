import java.io.*;

public class t2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int result = 0;
            result = a*b*c;

        int idx = String.valueOf(result).length();
        String arr[] = new String[idx];
        int count = 0;
        int countarr[] = new int[10];
            for(int i = 0 ; i < idx ; i++) {
                if (0 < i || i < idx) {
                    arr[i] = String.valueOf(result).substring(i, i + 1);
                }
                for (int j = 0; j < 10; j++) {
                    if (j == Integer.parseInt(arr[i])) {
                        countarr[j] += 1;
                    }
                }
            }
            for(int k = 0; k < 10 ; k++){
                bw.write(countarr[k] + "\n");
            }
            br.close();
            bw.flush();
            bw.close();
    }
}
