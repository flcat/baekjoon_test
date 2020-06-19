import java.io.*;
import java.util.StringTokenizer;

public class t1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        char checkBlack[][] = {
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
        };
        char checkWhite[][] = {
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},
        };

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

        int answer =  Integer.MAX_VALUE;
        for (int i = 0; i <= m - 8; i++) {
            for (int j = 0; j <= n - 8; j++) {
                for(int k = 0; k < 8; k++) {
                    //if (board[0][0] == 'B') {
                        if (checkBlack[i][j] != board[i+k][j+k]) {
                            count++;
                        }
                    //} else {
                        //if (checkWhite[i][j] != board[i+k][j+k]) {
                        //    count++;
                        //}
                    //}
                }
            }
            if(count >= 32) { count = 64 - count; }
            answer = Math.min(answer, count);
        }

        bw.write(answer+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
