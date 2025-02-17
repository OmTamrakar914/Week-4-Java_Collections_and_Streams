package advancedproblems.extractcurrencynumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyNumbers {
    public static List<String> extractCurrency(String text){
        ArrayList<String> list = new ArrayList<>();

        String regex = "[$]*[0-9]+\\.[0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            list.add(matcher.group());
        }
        return list;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        List<String> currency = extractCurrency(text);
        for(String str : currency){
            System.out.print(str+", ");
        }
        System.out.println("\b\b");
    }
}
