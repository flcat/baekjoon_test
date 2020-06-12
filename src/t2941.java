import java.io.*;

public class t2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        String n = br.readLine().trim();
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            if (n.contains(arr[i])) {
                n = n.replaceAll(arr[i], "*");
            }
        }
        count = n.length();

        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }
}
