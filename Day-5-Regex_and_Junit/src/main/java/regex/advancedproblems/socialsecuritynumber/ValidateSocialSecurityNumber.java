package advancedproblems.socialsecuritynumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    public static boolean validateSecurityNumber(String text){
        String regex = "\\b[0-9]{3}[-]{1}[0-9]{2}[-]{1}[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }

    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";

        if(validateSecurityNumber(text)){
            System.out.println("The number is valid.");
        }
        else {
            System.out.println("The number is not valid.");
        }
    }
}
