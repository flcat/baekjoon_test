import java.io.*;

public class t11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;
        String p[] = new String[n];
            for (int i = 0; i < num.length(); i++){
                p[i] = num.substring(i,i+1);
                sum+= Integer.parseInt(p[i]);
            }
            bw.write(String.valueOf(sum));
        br.close();
        bw.flush();
        bw.close();
    }
}
