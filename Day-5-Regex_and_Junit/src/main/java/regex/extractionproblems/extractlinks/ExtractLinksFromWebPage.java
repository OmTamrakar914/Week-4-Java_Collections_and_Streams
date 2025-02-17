package extractionproblems.extractlinks;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebPage {
    public static ArrayList<String> extractLinks(String text){
        ArrayList<String> links = new ArrayList<>();

        String regex = "https?:\\/\\/[^\\s\\'\",]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            links.add(matcher.group());
        }
        return links;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = extractLinks(text);

        for(String link : links){
            System.out.println(link+", ");
        }
    }
}
