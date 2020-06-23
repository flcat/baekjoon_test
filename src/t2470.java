import java.io.*;
import java.util.*;

public class t2470 {
    static long arr[];
    static long answer1;
    static long answer2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st;
        //정렬 후 최소값과 최대값을 구한 뒤 더 하고 그 값이 '-면' 최소값 인덱스 '+1'  '+면' 최대값 인덱스 '-1'
        int n = Integer.parseInt(br.readLine());
        arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        solution(n, arr);

        bw.write(answer1+" "+answer2);

        br.close();
        bw.flush();
        bw.close();
    }
    private static void solution(int n,long arr[]) {
        int begin = 0;
        int end = n - 1;
        long max = 2000000000;

        while (begin < end) {
            long sum = arr[begin] + arr[end];

            if(Math.abs(sum) < max) {
                answer1 = arr[begin];
                answer2 = arr[end];
                max = Math.abs(sum);
            }

            if(sum > 0) {
                end--;
            } else {
                begin++;
            }
        }
    }
}
