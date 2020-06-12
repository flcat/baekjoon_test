import java.io.*;

public class t5622_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        String nU = n.toUpperCase();
        String asc = "";
        for(int i = 0 ; i < nU.length(); i++) {
            asc += (int)nU.charAt(i)/3+3;
        }
        bw.write(asc);

        br.close();
        bw.flush();
        bw.close();
    }
}
