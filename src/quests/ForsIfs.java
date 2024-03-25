package quests;
import java.util.Scanner;
public class ForsIfs {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
       
        int input = scanner.nextInt();
        System.out.println("number : "+input);
        for (int i=0;i<=input;i++) {
            if ((Math.pow(2,i))%8!=0 ) {
                System.out.println("8 배수 아님");
            } else {
                int result = (int) Math.pow(2,i);
                System.out.println((result));
            }
        }
        scanner.close();

}
};
