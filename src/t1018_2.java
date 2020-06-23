import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class t1018_2 {
    static char checkBlack[] = {'B','W','B','W','B','W','B','W'};
    static char checkWhite[] = {'W','B','W','B','W','B','W','B'};
    static int answer = Integer.MAX_VALUE;
    static char board[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String insert = "";
        board = new char[m+1][n+1];
        char reverseBoard[][] = new char[m+1][n+1];
        for(int i = 0 ; i < n ; i++) {
            insert = br.readLine();
            for (int j = 0; j < m; j++) {
                board[j][i] = insert.charAt(j);
            }
        }


        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 8 <= n && j + 8 <= m) {
                    compareBoard(board,j,i);
                }
                //board[j][i] = reverseArr(board,j,i);
                List<char[]> list = Arrays.asList(board);
                Collections.reverse(list);
                board = list.toArray(new char[m][n]);
                bw.write(board[j][i]+"");
            }
            bw.write("\n");
        }

        bw.write(answer+"");
        br.close();
        bw.flush();
        bw.close();
    }
    private static void compareBoard(char mBoard[][],int a,int b) {
        int count = 0;

        for(int i = 0 ; i < 8 ; i++) {
            for(int j = 0 ; j < 8 ; j++) {
                if(mBoard[0][i] == 'B') {
                    if (mBoard[j + a][i + b] != checkBlack[i]) {
                        count++;
                    }
                } else {
                    if (mBoard[j + a][i + b] != checkWhite[i]) {
                        count++;
                    }
                }
            }
        }
        answer = Math.min(answer,count);
    }
    private static char reverseArr(char mBoard[][],int a,int b) {
        for(int i = 0 ; i < a ; i++)  {
            board[a][b] = mBoard[i][b];
        }
        return board[a][b];
    }
}
