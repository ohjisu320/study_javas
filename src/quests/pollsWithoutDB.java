// 설문 문항 하나씩 출력되면서 답하는 설문 구현
package quests;
import java.util.ArrayList;
import java.util.Scanner;
public class pollsWithoutDB {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> questionList = new ArrayList<String>();
        questionList.add("인터스텔라 선호도");
        questionList.add("해리포터 선호도");
        ArrayList<String> answerList = new ArrayList<String>();
        answerList.add("좋음");
        answerList.add("중간");
        answerList.add("나쁨");


        ArrayList<String> useranserList = new ArrayList<String>();
    
        System.out.println("설문이 시작됩니다.");
        for (int i=0;i<questionList.size();i++){
            System.out.println(questionList.get(i));
            for (int j=0;j<answerList.size();j++){
                System.out.print(j+1+") "+answerList.get(j));
            }
            System.out.println("");
            System.out.print("답하기 : ");
            useranserList.add(scanner.nextLine());
        }
        System.out.print("답한 내역 출력 : ");
        for (int n=0;n<useranserList.size();n++){
            System.out.print(useranserList.get(n));
            if (n==useranserList.size()-1) {
                break;
            }
            System.out.print(", ");
        }
            

        
        

    }
}
