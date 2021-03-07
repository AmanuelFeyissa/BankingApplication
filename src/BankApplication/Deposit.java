package BankApplication;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Deposit extends Balance{

    public void depositorInfo(){

        Scanner depositorName = new Scanner(System.in);
        Scanner depositorPhoneNum = new Scanner(System.in);

        System.out.println("\t\t\t\t\t--------------------------------------------------");
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.print("\t\t\t\t\tEnter The Depositor Name(Your Name) : ");
        depositorName.nextLine();
        System.out.print("\t\t\t\t\tEnter The Depositor's Phone Number(Your Phone Number) : ");
        depositorPhoneNum.nextDouble();
        System.out.println("\t\t\t\t\t--------------------------------------------------");
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.println();
        System.out.println();
    }
    public void askDepositAmount(){
        Scanner askAmountN = new Scanner(System.in);
        Scanner askAmountW = new Scanner(System.in);
        Scanner accName = new Scanner(System.in);
        Scanner accNum = new Scanner(System.in);


        System.out.print("\t\t\t\t\tEnter The Name Of The Person You Want TO Send To: ");
        String disAccName = accName.nextLine();
        System.out.print("\t\t\t\t\tEnter The Account Number Of The Person You Want TO Send To: ");
        double disAccNum = accNum.nextDouble();
        System.out.print("\t\t\t\t\tPlease Enter How Much Money You're Going To Deposit in Number: ");
        double disAskAmountN = askAmountN.nextDouble();
        System.out.print("\t\t\t\t\tPlease Enter How Much Money You're Going To Deposit in Words: ");
        String disAskAmountW = askAmountW.nextLine();

        //Current Date Formatter
        DateTimeFormatter dateAndTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        //Receipt
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\tYou Can ScreenShot This Section To Use As A Receipt");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t--------------------------------------------------");
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t BANKING APPLICATION DEPOSIT RECEIPT");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\tName: " + disAccName);
        System.out.println("\t\t\t\t\t\t\tDate And Time: " + dateAndTimeFormatter.format(now));
        System.out.println("\t\t\t\t\t\t\tAccount Number: " + disAccNum);
        System.out.println("\t\t\t\t\t\t\tAmount in Numbers: " + disAskAmountN);
        System.out.println("\t\t\t\t\t\t\tAmount in Words: " + disAskAmountW + "Only");
        System.out.println();
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t--------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        //ASSUMING SOME AMOUNT HAS BEEN DEPOSITED TO OUR ACCOUNT

        if (super.ACCOUNTNUMBER == 100006060) {
                super.balance = super.balance + disAskAmountN;
        }
    }
    }

