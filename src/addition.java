import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
         */

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        /*
        첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
         */

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
