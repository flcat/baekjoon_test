import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class t4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean arr[] = new boolean[10001];

        for(int i = 0 ; i <= 10000 ; i++) {
            int dn = dN(i);
            if(dn <= 10000) {
                arr[dn] = true;
            }
        }

        for(int j = 0 ; j <= arr.length-1 ; j++) {
            if(!arr[j]){
                bw.write(j+"\n");
            }
        }
    bw.flush();
    bw.close();
    }
    private static int dN(int n) {
        int dn = n;

        while (n > 0){
            dn+=n%10;
            n/=10;
        }
        return dn;
    }
}

