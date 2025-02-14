package map.invertmap;

import java.util.*;

public class InvertaMap {

    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map){
        Map<Integer, List<String>> invert = new HashMap<>();

        for(Map.Entry<String,Integer> entry: map.entrySet() ){
            String key = entry.getKey();
            int value = entry.getValue();
            ArrayList<String> list = new ArrayList<>();

            if(invert.containsKey(value)){
                 list.addAll(invert.get(value));
            }
                list.add(key);
            invert.put(entry.getValue(),list);
        }
        return  invert;
    }

    public static void main(String[]args){
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",1);
        System.out.println(invertMap(map));
    }
}
