// refer: https://www.w3schools.com/java/java_while_loop.asp
public class LoopsWhiles {
    public static void main(String[] agrs){
        // while문에서 종료하기: 1)if 문에서 break / 2)while에 조건을 주는 것.
        // while (condition) {
        // }

        // conditon으로 while문 종료
        int count =0;
        while (count<10) {
            System.out.println("conditon으로 종료 상황 만들기 count : "+count);
            count = count + 1;
        }
        
        // break로 while 종료
        count =0;
        boolean whileFlag = true;
        while (whileFlag) { // 무한Loop
            count = count + 1;
            System.out.println("break로 종료 상황 만들기 count : "+count);
            if (count >= 10){
                break;
            }
        }
        System.out.println("Hello Main !");

    }
}
