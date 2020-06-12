import java.io.*;


public class t8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String answer[] = new String[n+1];
        int count = 0;
        int sum = 0;
        int score = 0;

        for(int i = 0 ; i < n; i++){
                answer[i] = br.readLine();
                for(int j = 0 ; j < answer[i].length() ; j++) {
                    if (answer[i].charAt(j)=='O') {
                        ++count;
                        sum += count;
                    } else {
                        count = 0;
                    }
                    score = sum;
                }
        sum = 0;
        count = 0;
        bw.write(score+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
