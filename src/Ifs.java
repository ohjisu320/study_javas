import java.util.Scanner;
public class Ifs {
    public static void main(String[] agrs){
        // if (condition) {
        // } else if (condition) {
        // } else {
        // }
        /*
        예제 : 시간에 따른 영어 인사
        Good Morning : 6~11
        Good day : 11~17
        Good evening : 18~23
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("What hour is it?");
        int hour = scanner.nextInt();
        if (hour <= 11) { //Good Morning : 6~11
            System.out.println("Good Morning !");
        } else if (hour <= 17) {
            System.out.println("Good day !");
        } else if (hour <= 23 ){
            System.out.println("Good evening !");
        };

        /*
        예제 : 시간에 따른 영어 인사 and 조건 추가 
        Good Morning : 6~11
        Good day : 11~17
        Good evening : 18~23
         */
        System.out.print("What hour is it?");
        // int hour = scanner.nextInt(); 
        // error : Duplicate local variable hourJava, 해결 Datatype 정리
        
        hour = scanner.nextInt(); 
        
        if ((hour >= 6) && (hour <= 11)) { //Good Morning : 6~11
            System.out.println("Good Morning !");
        } else if ((hour > 11) && (hour <= 17)) {
            System.out.println("Good day !");
        } else if ((hour > 17 )&& (hour <= 23 )){
            System.out.println("Good evening !");
        } else {
            System.out.println("Don't know !");
        };


    }
}
