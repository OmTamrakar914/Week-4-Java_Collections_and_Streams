package advancedproblems.extractrepeatingwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtractingRepeatingWords {
    public static List<String> extractRepeatedWords(String text) {
       List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }
       return list;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        List<String> list = extractRepeatedWords(text);
        for(String word : list){
            System.out.print(word+", ");
        }
        System.out.println("\b\b");
    }
}
