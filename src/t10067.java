import java.io.*;
import java.util.*;

public class t10067 {
    static int N,K;
    static long S[] = new long[100001];
    static long D[][] = new long[2][100001];
    static int OPT[][] = new int[201][100001];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++) {
            S[i] = Integer.parseInt(st.nextToken());
            S[i] += S[i-1];
        }
        solve();

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean canSkip(int k, int i, int j,int threshold) {
        return (D[(K%2)-1][i] - D[(K%2)-1][j] + S[N] * (S[j] - S[i]))
                <= threshold * (S[j] - S[i]);
    }

    private static boolean canRemoveLastCandidate(int k, int i, int j, int l) {
        return (D[(K%2)-1][i] - D[(K%2)-1][j] + S[N] * (S[j] - S[i])) * (S[l] - S[j])
                <= (D[(K%2)-1][j] - D[(K%2)-1][l] + S[N] * (S[l] - S[j])) * (S[j] - S[i]);
    }

    private static void dp(int k) {
        LinkedList<Integer> candid = new LinkedList<>();
        candid.addLast(k-1);

        for(int i = k ; i <= N ; i++) {
            while (candid.size() > 1 && canSkip(k, candid.get(0), candid.get(1), Math.toIntExact(S[i]))) {
                candid.removeFirst();
            }
                int j = candid.getFirst();
                OPT[k][i] = j;
                D[(K%2)][i] = D[(K%2)-1][j] + S[i] * S[j] - S[N] * S[j] + S[N] * S[i] - (S[i] * S[i]);

            while (candid.size() > 1
                    && canRemoveLastCandidate(k, i, candid.getLast(), candid.get(candid.size()-2))) {
                candid.removeLast();
            }
            candid.addLast(i);
        }
    }
    private static Vector<Integer> backtrace(int ind) {
        Vector<Integer> ret = new Vector<>();
        new Vector();
        int k = K;
        while (k > 0) {
            ret.add(ret.size(),ind);
            ind = OPT[k--][ind];
        }
        Collections.reverse(ret);
     return ret;
    }
    private static void solve() throws IOException {
        for(int k = 1 ; k <= K ; k++) {
            Arrays.fill(D[K%2], 0);
            dp(k);
        }
        long ret = 0; int ind = 1;
        for(int i = 1 ; i <= N ; i++) {
            if(ret < D[K%2][i]) {
                ret = D[K%2][i];
                ind = i;
            }
        }
        bw.write(ret+"\n");
        Vector<Integer> opt = backtrace(ind);
        for(int x : opt) {
            bw.write(x+" ");
        }
    }
}
