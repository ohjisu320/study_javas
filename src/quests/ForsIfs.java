package quests;
import java.util.Scanner;
public class ForsIfs {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i=0;i<=input;i++) {
            if ((Math.pow(2,i))%4!=0 ) {
                System.out.println("4 배수 아님");
            } else {
                System.out.println((Math.pow(2,i)));
            }
        }
        scanner.close();

}
};
