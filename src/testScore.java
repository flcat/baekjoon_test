import java.util.Scanner;

public class testScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score>=90 && score <= 100){
            System.out.println("A");
        } else if(90 > score && score>=80){
            System.out.println("B");
        } else if(80 > score && score>=70){
            System.out.println("C");
        } else if(70 > score && score>=60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
