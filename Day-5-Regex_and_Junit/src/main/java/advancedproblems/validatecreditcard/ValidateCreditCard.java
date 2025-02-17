package advancedproblems.validatecreditcard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static boolean validateCreditCard(String cardnumber){
        String regexVisa = "[4-5]{1}[0-9]{15}";
        Pattern pattern = Pattern.compile(regexVisa);
        Matcher matcher = pattern.matcher(cardnumber);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the credit card number : ");
        String cardnumber = sc.next();

        if(validateCreditCard(cardnumber)){
            System.out.println("The Card number is valid.");
        }else {
            System.out.println("The Card number is not valid.");
        }
    }
}
