import java.io.*;
import java.util.StringTokenizer;

public class t1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        String insert = "";
        char board[][] = new char[m+1][n+1];
        for(int i = 0 ; i < n ; i++) {
            insert = br.readLine();
            for (int j = 0; j < m; j++) {
                board[j][i] = insert.charAt(j);
            }
        }

        //배열에 넣고 만약 0,0이 b면 bwbwbw w면 wbwbwb로만 나와야함.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[0][0] == 'B') {
                    if (board[j][i] == 'B' && board[j][i] != 'W') {
                        count++;
                    }
                } else {
                    if (board[j][i] == 'W' && board[j][i] != 'B') {
                        count++;
                    }
                }
            }
        }


        bw.write("\n"+count);
        br.close();
        bw.flush();
        bw.close();
    }
}
