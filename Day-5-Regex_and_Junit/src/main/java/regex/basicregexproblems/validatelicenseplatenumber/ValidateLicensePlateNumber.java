package basicregexproblems.validatelicenseplatenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {

    public static boolean validateLicenseNumber(String number){
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the License plate number : ");
        String number = sc.next();

        if(validateLicenseNumber(number)){
            System.out.println("The license plate number is valid");
        }else {
            System.out.println("The License plate number is not valid");
        }
    }
}
