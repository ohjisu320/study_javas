package quests;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class problemsWithoutDB {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> interview = new HashMap<String, String>();
        interview.put("문제: Python에서 변수를 선언하는 방법은? (점수: 10점)", "1) var name, 2) name = value, 3) set name, 4) name == value");
        interview.put("문제: Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)", "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        interview.put("문제: Python에서 조건문을 작성하는 방법은? (점수: 10점)", "1) if-else, 2) for-in, 3) while, 4) def");
        interview.put("문제: Python에서 함수를 정의하는 방법은? (점수: 5점)", "1) class, 2) def, 3) import, 4) return");
        
        ArrayList<Integer> useranswer = new ArrayList<Integer>();


        System.out.println("설문이 시작됩니다.");
        int i = 0;
        for (String key:interview.keySet()) {
            i = i+1;
            System.out.print(i+". ");
            System.out.println(key);
            System.out.println(interview.get(key));
            useranswer.add(scanner.nextInt());

        }

        System.out.println("Program End !");

    }


    public static void sub(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> interview = new HashMap<String, String>();
        interview.put("문제: Python에서 변수를 선언하는 방법은? (점수: 10점)", "1) var name, 2) name = value, 3) set name, 4) name == value");
        arrayList.add(interview);
        interview = new HashMap<>();
        interview.put("문제: Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)", "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        arrayList.add(interview);
        interview = new HashMap<>();
        interview.put("문제: Python에서 조건문을 작성하는 방법은? (점수: 10점)", "1) if-else, 2) for-in, 3) while, 4) def");
        arrayList.add(interview);
        interview = new HashMap<>();
        interview.put("문제: Python에서 함수를 정의하는 방법은? (점수: 5점)", "1) class, 2) def, 3) import, 4) return");
        arrayList.add(interview);
        
        ArrayList<Integer> useranswer = new ArrayList<Integer>();


        System.out.println("설문이 시작됩니다.");
        for (int i = 0;i<arrayList.size();i++) {
            System.out.print(i+1+". ");
            for (String key:arrayList.get(i).keySet()){
                System.out.println(key);
                System.out.println(arrayList.get(i).get(key));
               
            }
            useranswer.add(scanner.nextInt());
        }

        System.out.println("Program End !");
        scanner.close();

    }
}
