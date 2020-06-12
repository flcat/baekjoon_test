import java.util.Arrays;
import java.util.Scanner;

public class t10817_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i = 0 ; i <= 2 ; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        System.out.println(arr[1]);
    }
}
