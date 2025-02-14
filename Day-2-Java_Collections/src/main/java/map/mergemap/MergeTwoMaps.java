package map.mergemap;
import java.util.HashMap;
import java.util.Map;
public class MergeTwoMaps {

    public static Map<String,Integer> mergeMap(Map<String,Integer> map1,Map<String,Integer> map2 ){
       Map<String,Integer> map = new HashMap<>(map1);

        for(Map.Entry<String,Integer> entry : map2.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            map.put(key, map.getOrDefault(key,0)+value);
        }
        return map;
    }
    public static void main(String[]args){
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("B",3);
        map2.put("C",4);

        System.out.println(mergeMap(map1,map2));
    }

}
