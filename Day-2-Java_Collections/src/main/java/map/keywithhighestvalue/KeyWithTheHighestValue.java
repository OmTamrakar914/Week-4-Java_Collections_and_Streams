package map.keywithhighestvalue;

import java.util.HashMap;
import java.util.Map;

public class KeyWithTheHighestValue {
    public static String maxvalueKey(Map<String,Integer> map){
        int maxValue = Integer.MIN_VALUE;
        String maxKey = "";

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
      return maxKey;
    }

    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",15);
        map.put("C",20);
        map.put("D",17);

        System.out.println(map);
        System.out.println("Key with maximum value : "+ maxvalueKey(map));
    }
}

