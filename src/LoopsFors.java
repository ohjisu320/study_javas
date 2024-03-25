// refer: https://www.w3schools.com/java/java_for_loop.asp
public class LoopsFors {
    public static void main(String[] agrs){
        /*
            for 동작 조건 : 시작점, 종료조건, 반복횟수
            statement 1 : 시작점
            statement 2 : 종료조건
            statement 3 : 반복횟수 
         for (statement 1 ; statement 2 ; statement 3){
         }
         */

         /*
          예제 : 1부터 5까지 1씩 증가하며 출력 
          */
        /*
        for (int count=1 ; count<=5 ; count = count + 1){
        }
         */
        for (int count=1 ; count<=5 ; count++){
            System.out.println("For Count : "+count);
        }

        System.out.println("Hello Main !");

    }
}
