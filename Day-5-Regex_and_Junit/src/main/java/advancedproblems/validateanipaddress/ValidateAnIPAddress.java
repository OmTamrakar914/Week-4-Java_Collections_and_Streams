package advancedproblems.validateanipaddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAnIPAddress {
    public static boolean validateIPAddress(String address){
        String regex = "[0-9]{1,3}\\.+[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IPv4 Address : ");
        String ipAddress = sc.next();

        if (validateIPAddress(ipAddress)) {
            System.out.println("The IP address is valid.");
        }else
        System.out.println("The IP address is not valid.");
    }
}
