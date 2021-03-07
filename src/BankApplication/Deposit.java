package BankApplication;

import java.util.Scanner;

//DEPOSIT CLASS
class Deposit {

    public void depositorInfo(){
        Scanner depositorName = new Scanner(System.in);
        Scanner depositorPhoneNum = new Scanner(System.in);
        System.out.print("Enter The Depositor Name(Your Name) : ");
        depositorName.nextLine();
        System.out.println("Enter The Depositor's Phone Number(Your Phone Number) : ");
        depositorPhoneNum.nextDouble();
    }
    public void getDepositAmount(){
        Scanner askAmountN = new Scanner(System.in);
        Scanner askAmountW = new Scanner(System.in);
        Scanner accName = new Scanner(System.in);
        Scanner accNum = new Scanner(System.in);


        System.out.print("Enter The Name Of The Person You Want TO Send To: ");
        String disAccName = accName.nextLine();
        System.out.print("Enter The Account Number Of The Person You Want TO Send To: ");
        double disAccNum = accNum.nextDouble();
        System.out.print("Please Enter How Much Money You're Going To Deposit in Number: ");
        double disAskAmountN = askAmountN.nextDouble();
        System.out.print("Please Enter How Much Money You're Going To Deposit in Words: ");
        String disAskAmountW = askAmountW.nextLine();

        //Receipt
        System.out.println();
        System.out.println();
        System.out.println("You Can ScreenShot This Section To Use As A Receipt");
        System.out.println();
        System.out.println();
        System.out.println("*********************************************************************");
        System.out.println("Name: " + disAccName);
        System.out.println("Account Number: " + disAccNum);
        System.out.println("Amount in Numbers: " + disAskAmountN);
        System.out.println("Amount in Words: " + disAskAmountW + "Only");
        System.out.println("*********************************************************************");
    }


}

