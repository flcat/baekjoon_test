import java.io.*;

public class t11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char n = (char) br.read();

        int asc = (int)(n);

        bw.write(asc+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
