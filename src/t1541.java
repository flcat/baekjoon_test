import java.io.*;

public class t1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] terms = br.readLine().split("\\-");
        int answer = 0;

        for(int i = 0 ; i < terms.length; i++){
            int addNum = addition(terms[i]);

            if(i == 0) { addNum *= -1; }

            answer -= addNum;
        }
        bw.write(answer+"");
        br.close();
        bw.flush();
        bw.close();
    }
    private static int addition(String arr) {
        String[] num = arr.split("\\+");
        int result = 0;
        for(String t : num) {
            result += Integer.parseInt(t);
        }
        return result;
    }
}
