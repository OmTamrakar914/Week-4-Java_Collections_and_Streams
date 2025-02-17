package bothcheckedanduncheckedexception;

import java.util.Scanner;

public class BankTransactionSystem {

    public static void withdraw(double amount)throws IllegalArgumentException{
        double balance = 1000;

        try{
            if(amount <0){
                throw new IllegalArgumentException("Invalid amount!");
            }
            try{
                if(balance < amount){
                    throw new CustomedException("Insufficient balance!");
                }
                System.out.println("Withdrawal successful, new balance: "+(balance-amount));
            }catch (CustomedException e){
                System.out.println(e.getMessage());
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to withdraw");
        int amount = sc.nextInt();

        withdraw(amount);
    }
}
