package throwandthrows;

import uncheckedexceptions.RunTimeExceptions;

public class ExceptionPropagation {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount < 0 || rate <0){
            throw new IllegalArgumentException("Amount and rate must be positive!");
        }
        return  (amount*rate*years)/1000;
    }

    public static void main(String[] args) {
       try {
         double amount = 1000;
         double rate = 12;
         int years = 3;

         double interest = calculateInterest(amount,rate,years);
           System.out.println("calculated Interest : "+interest);
       }catch (IllegalArgumentException e){
           System.out.println("Invalid input : "+e.getMessage());
       }
    }
}
