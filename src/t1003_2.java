import java.io.*;

public class t1003_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int f[][] = new int[41][2];
        f[0][0] = 1;
        f[1][1] = 1;
        for(int i = 2; i < 41; i++) {
            for(int j = 0; j < 2; j++) {
                f[i][j] = f[i - 1][j] + f[i - 2][j];
            }
        }
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(f[n][0]+" "+f[n][1]+"\n");
        }
    br.close();
    bw.flush();
    bw.close();
    }
}
