import java.util.Scanner;


public class TypeCastIntegers {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        // 두개 값 받기
        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();

        int intFirst = Integer.parseInt(strFirst);
        int intSecond = Integer.parseInt(strSecond);

        scanner.close();
        System.out.println("Hello Main !");

    }
}
