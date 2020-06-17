import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class t4008_2 {
    static int n;
    static long a,b,c;
    static long s[] = new long[1000001];
    static long d[] = new long[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= n ; i++) {
            s[i] = Integer.parseInt(st.nextToken());
            s[i] += s[i-1];
        }

        bw.write(solve()+"");

        br.close();
        bw.flush();
        bw.close();
    }
    private static double intersect(int i,int j) {
        return (a * ((s[j] * s[j]) - (s[i] * s[i])) - b * (s[j] - s[i]) + d[j] - d[i]) / (2.0 * a * (s[j] - s[i]));
    }
    private static long evaluate(int n) {
        return a * (s[n]*s[n]) + b * s[n] + c;
    }

    private static long solve () {

        LinkedList<Integer> candid = new LinkedList<>();
        candid.addLast(0);

        for(int k = 1 ; k <= n ; k++) {
            while(candid.size() > 1 && intersect(candid.getFirst(), candid.get(1)) < s[k]) {
                candid.removeFirst();
            }
            int i = candid.getFirst();
            d[k] = -2 * a * s[i] * s[k] + a * (s[i]*s[i]) - b * s[i] + d[i] + evaluate(k);

            while (candid.size() > 1 && intersect(k,candid.get(candid.size()-2))
                    < intersect(candid.getLast(), candid.get(candid.size()-2))) {
                candid.removeLast();
            }
            candid.addLast(k);
        }
        return d[n];
    }
}
