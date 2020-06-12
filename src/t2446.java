import java.io.*;

public class t2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int k = 0 ; k < n ; k++) {
            for(int j = 0 ; j < k ; j++) {
                sb.append(" ");
            }
            for (int i = 0 ; i < (n*2-1) - (2*k); i++) {
                    sb.append("*");
            }
            sb.append("\n");
        }

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 1 ; j < (n-1)-i ; j++){
                sb.append(" ");
            }
            for(int k = 0; k < 3 + 2 * i ; k++){
                sb.append("*");
            }
            sb.append("\n");
        }
            br.close();
        System.out.print(sb);
    }
}
