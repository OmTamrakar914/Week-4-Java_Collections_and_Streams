package map.banking.system;

public class ImplementingBankingSystem {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount("A101", 5000.00);
        bank.createAccount("A102", 3000.00);
        bank.createAccount("A103", 7000.00);

        bank.deposit("A101", 2000.00);
        bank.requestWithdrawal("A102");
        bank.requestWithdrawal("A103");

        bank.displayAccounts();
        bank.processWithdrawals();
    }
}
