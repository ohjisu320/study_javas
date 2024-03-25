package quests;
import java.util.Scanner;
public class WhilesIfs {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("점수 입력 : ");
            int userinput = scanner.nextInt(); 

            if (userinput==-1){
                break;
            } else if (userinput >= 90) {
                System.out.println("A");
            } else if (userinput >= 80) {
                System.out.println("B");
            } else if (userinput >= 70) {
                System.out.println("C");
            } else {
                System.out.println("F");
            }
    
        }
        System.out.println("Program End !");

    }
}
