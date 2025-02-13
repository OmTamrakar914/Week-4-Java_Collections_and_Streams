package list.elementfrequency;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import static java.lang.System.*;

public class FindTheFrequenccyOfElements {
    public static Map<String,Integer> countFrequency(List<String> list){
        Map<String,Integer> map = new HashMap<>();

        for(String str : list){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        return map;
    }

    public static void main(String[] args){
        List<String> list = Arrays.asList("apple","banana","orange","apple","orange");

        out.println(countFrequency(list));
    }
}
