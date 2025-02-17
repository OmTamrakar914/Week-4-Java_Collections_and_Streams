package extractionproblems.extractdates;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingDates {
    public static List<String> extractDates(String text){
        List<String> dates = new ArrayList<>();

        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        List<String > datesList = extractDates(text);
        for (String date : datesList){
            System.out.print(date+", ");
        }
    }
}
