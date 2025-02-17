package basicregexproblems.hexcode;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAHexColorCode {
    public static boolean validateHexCode(String code){
        String regex = "^[#]{1}[a-zA-Z0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hex Color Code : ");
        String code = sc.next();

        if(validateHexCode(code)){
            System.out.println("The Hex Color Code is Valid");
        }else{
            System.out.println("The Hex color Code is not valid");
        }
    }
}
