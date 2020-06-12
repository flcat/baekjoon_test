import java.io.*;
import java.util.StringTokenizer;

public class t11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n[] = new int[2];
               n[0] = Integer.parseInt(st.nextToken());
               n[1] = Integer.parseInt(st.nextToken());
        int money[] = new int[n[0]];
        int result = 0;
        for(int j = 0 ; j < n[0] ; j++) {
           money[j] = Integer.parseInt(br.readLine());
        }


        for(int i = n[0]-1 ; i >= 0 ; i--){
            result+=n[1]/money[i];
            n[1]=n[1]%money[i];
        }


        bw.write(result+"");
        br.close();
        bw.flush();
        bw.close();
    }
}
