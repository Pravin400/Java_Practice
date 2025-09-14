package _6_class_component._2_methods.Demo6CallByValue;

public class Demo6CallByValue {
    public static void main (String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 101;
        bankAccount.balance = 1000;

        updateBankAccount(bankAccount);

        System.out.println("main method");
        System.out.println("Bank Name : "+bankAccount.bankName);
        System.out.println("Account number = " + bankAccount.accountNumber);//1111111
        System.out.println("Account Balance = " + bankAccount.balance);//99999
    }
    private static void updateBankAccount(BankAccount bankAccount) {
        bankAccount.accountNumber = 1111111;
        bankAccount.balance = 99999;
        System.out.println("updateBankAccount method");
        System.out.println("Bank Name : "+bankAccount.bankName);
        System.out.println("Account number = " + bankAccount.accountNumber);//1111111
        System.out.println("Account Balance = " + bankAccount.balance);//99999
    }

}
