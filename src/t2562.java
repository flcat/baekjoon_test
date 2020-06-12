import java.io.*;

public class t2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n[] = new int[9];
        int max = 0;
        int idx = 0;

        for(int i = 0; i < n.length; i++){
            n[i] = Integer.parseInt(br.readLine());
            if(max<=n[i]){
                max = n[i];
                idx = i+1;
            }
        }
        br.close();
        bw.write(max+"\n"+idx);
        bw.flush();
        bw.close();
    }
}
