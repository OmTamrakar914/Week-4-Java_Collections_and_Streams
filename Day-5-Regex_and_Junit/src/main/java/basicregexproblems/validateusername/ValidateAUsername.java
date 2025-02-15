package basicregexproblems.validateusername;
import java.lang.System;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAUsername {
    public static boolean validateAUsername(String username){
        String regex = "^[a-zA-Z]{1}[a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

       return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String username = sc.next();

       if(validateAUsername(username)){
           System.out.println("The username is valid");
       }else{
           System.out.println("The username is not valid");
       }
    }
}
