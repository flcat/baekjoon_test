import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class t2568 {
  static int[][] arr;
  static int[] d;
  static int setup;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());

    arr = new int[N + 1][2];
    d = new int[N + 1];
    setup = 1;

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    });

    dp(N);

    bw.write(N - setup+"\n");
    for(int i = 1; i < N; i++) {
      bw.write(binarySearch(arr,arr[i][1],N - 1)+"\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
  private static void dp(int n) {
    for (int i =  1; i <= n; i++) {
      d[i] = 1;
      for (int j = 1; j < i; j++) {
        if(arr[j][1] < arr[i][1] && d[i] < d[j] + 1) {
          d[i] = d[j] + 1;
        }
      }
      for(int k = 0; k < d.length;k++) {
        if (setup < d[k]) {
          setup = d[i];
        }
      }
    }
  }
  private static int binarySearch(int[][] arr, int begin, int end) {
    while (begin < end) {
      int mid = (begin + end) / 2;
      if (arr[mid][0] >= end) {
        end = mid;
      } else {
        begin = mid + 1;
      }
    }
    return end + 1;
  }
}
