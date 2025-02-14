package map.frequencycount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static Map<String,Integer> wordFrequency(String filepath){
        Map<String,Integer> countWord = new HashMap<>();
        String filePath = filepath;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split(" ");

                //counting the frequency in map
                for(String word : words){
                    countWord.put(word, countWord.getOrDefault(word,0)+1);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return countWord;
    }

    public static void main(String[]args){
        String filePath = "src\\main\\java\\map\\FrequencyCount\\input.txt";
        System.out.println(wordFrequency(filePath) );
    }
}
