package extractionproblems.extractemailsfromtext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailsfromText {

    public static List<String> extractEmails(String text){
        ArrayList<String> emails = new ArrayList<>();

        String regex = "[a-zA-Z0-9_.*-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            emails.add(matcher.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
       List<String> list = extractEmails(text);

       for(String str : list){
           System.out.println(str);
       }
    }
}
