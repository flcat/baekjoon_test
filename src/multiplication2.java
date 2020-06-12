import java.util.Scanner;

public class multiplication2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result1 = a * (b%10);
        int result2 = a * ((b%100) / 10);
        int result3 = a * (b/100);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(a*b);
    }
}
