import java.util.HashMap;
public class DatatypeHashMaps {
    public static void main(String[] agrs){
        HashMap<String, String> hashMap = new HashMap<String, String>();
        // 값 넣기
        hashMap.put("England", "London");
        hashMap.put("Germany", "Berlin");
        hashMap.put("Norway", "Oslo");

        /*
        hashMap
        HashMap@9 size=3
        0:
        HashMap$Node@30
        1:
        HashMap$Node@31
        2:
        HashMap$Node@32
        hashMap.get("Norway")
        "Oslo"
        hashMap.size()
        3
        hashMap.remove("Germany")
        "Berlin"
        hashMap.size()
        2
         */
        for(String key:hashMap.keySet()) {
            System.out.println("hashMap value with key : "+key+", value : "+hashMap.get(key));
        }
        System.out.println("Hello Main !");

    }
}
