import java.io.*;

public class t1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        String s = br.readLine();
        String arr[] = s.split(" ");
        if(arr.length > 0) {
            if ("".equals(arr[0])) {
                bw.write(String.valueOf(arr.length - 1));
            } else {
                bw.write(String.valueOf(arr.length));
            }
        } else{
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
