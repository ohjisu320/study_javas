// refer: https://www.w3schools.com/java/java_strings.asp

public class DataTypesStrings {
    public static void main(String[] agrs){        
        // String
        String strFirst = "Hello !";
        String strSecond = new String("World !");
        System.out.println("String First : "+strFirst);
        System.out.println("String Second : "+strSecond);
        // strFirst instanceof String
        // true
        // strSecond instanceof String
        // true
        // strFirst.length()
        // 7
        // strSecond.concat(strFirst)
        // "World !Hello !"
        // String strThird = strFirst.replaceAll("ll", "RR")
        return;

    }
}
