import java.io.*;

public class t10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        for(char c = 'a' ; c <= 'z' ; c++){
            bw.write(s.indexOf(c)+ " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
