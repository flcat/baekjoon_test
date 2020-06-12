import java.io.*;

public class t1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = n;
        for(int i = 0 ; i < n ; i++){
            String word = br.readLine().toLowerCase();
            boolean[] alphabet = new boolean[26];
            for(int j = 1 ; j < word.length() ; j++) {
               if(word.charAt(j-1) != word.charAt(j)) {
                   if(alphabet[word.charAt(j)-97] == true) {
                       count--;
                       break;
                   }
                   alphabet[word.charAt(j-1)-97] = true;
               }
            }
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }
}
