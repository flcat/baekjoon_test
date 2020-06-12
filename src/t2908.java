import java.io.*;

public class t2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n[] = br.readLine().split(" ");
        String tmp1,tmp2;
        String rvs1="",rvs2="";
        tmp1 = n[0];
        tmp2 = n[1];
        for(int i = 2 ; i >= 0 ; i--) {
            rvs1+=tmp1.charAt(i);
            rvs2+=tmp2.charAt(i);
        }
        if(Integer.parseInt(rvs1) < Integer.parseInt(rvs2)) {
            bw.write(rvs2);
        } else {
            bw.write(rvs1);
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
