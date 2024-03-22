package quests;
import java.util.Scanner;
public class Additons {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int intFirst = scanner.nextInt();
        int intSecond = scanner.nextInt();
        System.out.print(intFirst+intSecond);
        scanner.close();
    }
    
}
