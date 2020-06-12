import java.util.Scanner;
import java.util.stream.Stream;

public class multiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] digits = Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();

        scanner.close();
            int result1 = a * (digits[2]);
            int result2 = a * (digits[1]*10);
            int result3 = a * (digits[0]*100);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(a*b);

    }
}
