import java.io.*;
import java.util.StringTokenizer;

public class t1365 {
    static int n;
    static int uPole[];
    static int tree[];
    static int max = 100001;
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         StringTokenizer st;

         n = Integer.parseInt(br.readLine());

         uPole = new int[max];
         tree = new int[max * 4];

         st = new StringTokenizer(br.readLine());
         for(int i = 1; i <= n; i++) {
             uPole[i] = Integer.parseInt(st.nextToken());
         }

         for(int i = 1; i <= n; i++) {
             int m = sum(1, 1, uPole[i]+"".indexOf(i),1, n) + 1;
             update(1, uPole[i]+"".indexOf(i), m, 1, n);
         }

         bw.write(n - sum(1, 1, n, 1, n)+"\n");

         br.close();
         bw.flush();
         bw.close();
    }
    private static int sum(int index, int L, int R, int begin, int end) {
        if(R < begin || L > end) return 0;
        if(L <= begin && end <= R) return tree[index];
        else {
            int mid = (begin + end) >> 1;
            return Math.max(sum(index << 1, L, R, begin, mid),
                    sum((index << 1) + 1, L, R, mid + 1, end));
        }
    }
    private static void update(int index,int target, int value, int begin, int end) {
        if(target < begin || target > end) return;
        if(begin == end) {
            tree[index] = value;
            return;
        }
            int mid = (begin + end) >> 1;
            update(index << 1, target, value, begin, mid);
            update((index << 1) + 1, target, value,  mid + 1, end);
            tree[index] = Math.max(tree[index << 1],tree[(index << 1) + 1 ]);
    }
}
