import java.io.*;
import java.util.StringTokenizer;
public class t2098 {
    static int max = 1000000000;
    static int d[][];
    static int a[][];
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        a = new int [n + 1][n + 1];
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        d = new int[1 << n][n + 1];
        for(int i = 0; i <(1 << n); i++) {
            for(int j = 1; j <= n; j++) {
                d[i][j] = max;
            }
        }
        int answer = dp(1,1);
        bw.write(answer+"");
        br.close();
        bw.flush();
        bw.close();
    }
    private static int dp(int state,int here) {
    if(state == (1 << n) - 1) {
        return d[state][here] = a[here][1] == 0 ? max : a[here][1];
    }
        //memoization
        //메모이제이션(memoization)은 컴퓨터 프로그램이 동일한 계산을 반복해야 할 때,
        //이전에 계산한 값을 메모리에 저장함으로써 동일한 계산의 반복 수행을 제거하여 프로그램
        // 실행 속도를 빠르게 하는 기술이다. 동적 계획법의 핵심이 되는 기술이다.
        //메모아이제이션이라고도 한다.
        if(d[state][here] != max ) return d[state][here];

        for(int next = 1; next <= n; next++) {
            int toggle = (1 << (next - 1));
            if ((state & toggle) == toggle || a[here][next] == 0) continue;
            int opt = dp(state | toggle, next) + a[here][next];
            if(d[state][here] == max || d[state][here] > opt) d[state][here] = opt;
        }
        return d[state][here];
    }
}