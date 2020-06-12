import java.util.Scanner;

public class alarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int tmpH = 0;
        int tmpM = 0;
        scanner.close();
        if(m<45){
            tmpM = 60 - ( 45 - m );
            tmpH = h-1;
            if(tmpH < 0) {
                tmpH+=24;
            }
            System.out.println(tmpH+" "+tmpM);
        } else {
            tmpM = m - 45;
            if(h < 0) {
                h+=24;
            }
            System.out.println(h+" "+tmpM);
        }
    }
}
