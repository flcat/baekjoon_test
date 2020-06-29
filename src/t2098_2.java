import java.io.*;
import java.util.StringTokenizer;
public class t2098_2 {
    static int max = 1000000000;
    static int d[][];
    static int a[][];
    static int n;
    // 현재 상태 state 과 현재 노드 here 가 주어졌을 때 나머지 방문 안한 노드를
    // 전부 방문하고 1로 돌아가는 최소 거리를 리턴.
    static int dp(int state, int here) {
        if (state == (1 << n) - 1) {
            return d[state][here] = a[here][1] == 0 ? max : a[here][1];
        }
        // 메모이제이션
        if (d[state][here] != max) return d[state][here];
        for (int next = 1; next <= n; next++) {
            int toggle = (1 << (next-1));
            // 갈 수 없거나 이미 방문한 노드면 스킵
            if ((state & toggle) == toggle || a[here][next] == 0) continue;
            int opt = dp(state | toggle, next) + a[here][next];
            if (d[state][here] == max || d[state][here] >  opt) d[state][here] = opt;
        }
        return d[state][here];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        a = new int [n + 1][n + 1];
        // 문제를 잘 읽어보시면 0번부터가 아니라 1번부터입니다.
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        d = new int[1 << n][n + 1];
        for(int i = 0; i < (1 << n); i++) {
            for(int j = 1; j <= n; j++) {
                d[i][j] = max;
            }
        }
        int answer = dp(1, 1);
        bw.write(answer+"");
        br.close();
        bw.flush();
        bw.close();
    }
}