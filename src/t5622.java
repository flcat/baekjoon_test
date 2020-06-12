import java.io.*;

public class t5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        String nU = n.toUpperCase();
        String asc = "";
        int num = 0;
        int sum = 0;
        for(int i = 0 ; i < nU.length(); i++) {
            num = (int)nU.charAt(i);
            asc += num-65;
            if(num <= 67) {
                sum += 2;
            } else if(num <= 70) {
                sum += 3;
            } else if(num <= 73) {
                sum += 4;
            } else if(num <= 76) {
                sum += 5;
            } else if(num <= 79) {
                sum += 6;
            } else if(num <= 83) {
                sum += 7;
            } else if(num <= 86) {
                sum += 8;
            } else if(num <= 90) {
                sum += 9;
            }
        }
            bw.write(String.valueOf(sum+nU.length()));
        br.close();
        bw.flush();
        bw.close();
    }
}
