import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class t1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int t[][] = new int[n][2];

        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            t[i][0] = Integer.parseInt(st.nextToken());
            t[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(t, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        int tmp = -1;
        for(int j = 0 ; j < n ; j++){
                if (t[j][0] >= tmp){
                    tmp = t[j][1];
                    count++;
                }
        }
        bw.write(count+"");
        br.close();
        bw.flush();
        bw.close();
    }
}
