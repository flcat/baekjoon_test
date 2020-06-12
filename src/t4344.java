import java.io.*;

public class t4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine().trim());

        for(int i = 0 ; i < c ; i++){
            int sum = 0;
            float avg = 0;
            int count = 0;
            float p = 0;
            String n = br.readLine();
            String score[] = n.split(" ");
            int sc = Integer.parseInt(score[0]);
            int score_i[] = new int[sc];
            for(int j = 0 ; j < sc ; j++) {
                    score_i[j] = Integer.parseInt(score[j+1]);
                sum+=score_i[j];
            }
            avg = sum/sc;
            for(int k = 0 ; k < sc ; k++){
                if(score_i[k] > avg ) {
                    count++;
                }
            }
            p = (Float.parseFloat(String.valueOf(count))/Float.parseFloat(String.valueOf(sc))*100);
            bw.write(String.format("%.3f",p)+"%"+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
