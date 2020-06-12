import java.util.Scanner;

public class t1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = n;
        int count = 0;
        int tmp = 0;

        while (result!=n||count==0) {
                tmp = (result/10 + result%10)%10;
                tmp += (result%10)*10;
                result = tmp;
                count++;
        }
        System.out.println(count);
    }
}
