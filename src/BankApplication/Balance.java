package BankApplication;

public class Balance {
    double balance = 1000;
    final int ACCOUNTNUMBER = 100006060;
// Will finish everything on 2023
    void currentBalance(){
        if (balance == 0){
            System.out.println("\t\t\t\t\tYour Account is Empty");
            System.out.println("\t\t\t\t\tYou Have A Deposit Option If You Wish To Deposit An Amount ");
        }else{
            System.out.println("\t\t\t\t\tYour Balance Number Is " + balance);
        }
    }
}
