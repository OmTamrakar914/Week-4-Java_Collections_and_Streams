package extractionproblems.capitalizedwords;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RetrieveCapitalizedWords {
    public static List<String> retrieveCapitalWords(String text){
        ArrayList<String> words = new ArrayList<>();

        String regex = "[A-Z]{1}[a-zA-Z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            words.add(matcher.group());
        }
        return words;
    }

    public static void main(String[] args) {
       String text ="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

       List<String> words = retrieveCapitalWords(text);

       for(String word : words){
           System.out.print(word+", ");
       }
        System.out.println("\b\b");
    }
}
