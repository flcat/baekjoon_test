import java.io.*;

public class t2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String tmpSt = "";
        int tmpNum = 0;
        for(int i = 0 ; i < t ; i++) {
            String s = br.readLine();
            String p[] = s.split(" ");
            tmpNum = Integer.parseInt(p[0]);
            tmpSt = p[1];

            String arr[] = new String[tmpSt.length()];
            for (int j = 0; j < tmpSt.length(); j++) {
                arr[j] = tmpSt.substring(j, j + 1);
            }

            for (int k = 0; k < tmpSt.length(); k++) {
                for (int l = 0; l < tmpNum; l++) {
                    bw.write(arr[k]);
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
