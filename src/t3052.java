import java.io.*;

public class t3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean arr[] = new boolean[42];
        int count = 0;

        for(int i = 0 ; i < 10 ; i++){
            arr[Integer.parseInt(br.readLine())%42] = true; //해당 인덱스의 값을 true 로 바꿔줌.
                                                            // arr[39%42] 의 결과인 39, arr[39]의 값을 true 로 변경
        }

        for(boolean value : arr){
            if(value){
                count++;
            }
        }

        br.close();
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
