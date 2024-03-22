// 외부입력
import java.util.Scanner;
public class Scanners {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();

        scanner.close();
    }
}
