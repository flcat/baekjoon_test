import java.io.*;

public class t1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String upper = a.toUpperCase();

        int count[] = new int[26];
        int result = 0;
        int max = 0;

        for(int i = 0 ; i < upper.length() ; i++) {

            count[upper.charAt(i)-65]++;
            if (max < count[upper.charAt(i)-65]) {
                max = count[upper.charAt(i)-65];
                result = upper.charAt(i);
            } else if(max == count[upper.charAt(i)-65]) {
                result = 63;
            }
        }
        bw.write((char)result);
        br.close();
        bw.flush();
        bw.close();
    }
}
