import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++) {
                if (i % 2 == 0) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
        }
        sb.append("\n");
        for(int j = 0 ; j < n ; j++) {
            if(j%2==1) {
                sb.append("*");
            } else {
                sb.append(" ");
            }
        }
        for(int k = 0 ; k < n ; k++) {
            System.out.println(sb);
        }
    }
}
