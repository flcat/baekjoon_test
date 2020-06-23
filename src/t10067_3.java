import java.io.*;
import java.util.*;
class Solve {
    int N,K;
    long S[];
    long D[][];
    char OPT1[][];
    boolean OPT2[][];
    private boolean canSkip(int k, int i, int j,int threshold) {
        return (D[(k-1)%2][i] - D[(k-1)%2][j] + S[N] * (S[j] - S[i]))
                <= threshold * (S[j] - S[i]);
    }
    private boolean canRemoveLastCandidate(int k, int i, int j, int l) {
        return (D[(k-1)%2][i] - D[(k-1)%2][j] + S[N] * (S[j] - S[i])) * (S[l] - S[j])
                <= (D[(k-1)%2][j] - D[(k-1)%2][l] + S[N] * (S[l] - S[j])) * (S[j] - S[i]);
    }
    private void dp(int k) {
        int [] candid = new int[N + 1];
        int front = 0, back = 0;
        candid[back++] = k -1;
        for(int i = k ; i <= N ; i++) {
            while (back - front > 1 && canSkip(k, candid[front], candid[front + 1], (int) S[i])) {
                front++;
            }
            int j = candid[front];
            OPT2[k][i] = (j >= 60000);
            OPT1[k][i] = (char)(j - (j >= 60000 ? 60000 : 0));
            D[k%2][i] = D[(k-1)%2][j] + S[i] * S[j] - S[N] * S[j] + S[N] * S[i] - (S[i] * S[i]);
            while (back - front > 1
                    && canRemoveLastCandidate(k, i, candid[back-1], candid[back-2])) {
                back--;
            }
            candid[back++]=i;
        }
        candid = null;
    }
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 4);
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        S = new long[N + 1];
        D = new long[2][N + 1];
        OPT1 = new char[K + 1][N + 1];
        OPT2 = new boolean[K + 1][N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++) {
            S[i] = Integer.parseInt(st.nextToken());
            S[i] += S[i-1];
        }
        br.close();
        for(int k = 1 ; k <= K ; k++) {
            Arrays.fill(D[k%2], 0);
            dp(k);
        }
        long ret = 0; int ind = 1;
        for(int i = 1 ; i <= N ; i++) {
            if(ret < D[K%2][i]) {
                ret = D[K%2][i];
                ind = i;
            }
        }
        S = null;
        D = null;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 4);
        bw.write(ret+"\n");
        int[] opt = new int[K];
        int front = 0;
        int k = K;
        while (k > 0) {
            opt[front++]=ind;
            ind = (OPT2[k][ind] ? 60000 : 0) + (int)OPT1[k--][ind];
        }
        for(int i = K - 1; i >= 0; i--) {
            bw.write(opt[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
public class t10067_3 {
    public static void main(String[] args) throws IOException {
        Solve s = new Solve();
        s.solve();
    }
}