import java.io.*;
import java.util.*;

public class test {
    static String[] board = {"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW",
                             "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW"};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] input = new String[n];
        for(int i = 0; i < n; i++){
            input[i] = br.readLine();
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= n - 8; i++){
            for(int j = 0; j <= m - 8; j++){
                int cnt = 0;
                for(int k = 0; k < 8; k++){
                    String temp = input[i + k].substring(j, j + 8);
                    for(int l = 0; l < 8; l++){
                        if(temp.charAt(l) == board[k].charAt(l)){
                            cnt++;
                        }
                    }
                }
                if(cnt >= 32) cnt = 64 - cnt;
                ans = Math.min(ans, cnt);
            }
        }
        bw.write(ans + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}