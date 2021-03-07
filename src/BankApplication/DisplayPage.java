package BankApplication;

import java.util.Scanner;

 public class DisplayPage {

    public void welcomePage() {
        /* TODO put concatenation and name variable on LINE 17
           TODO put concatenation and Account number variable on LINE 18
         */
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("WELCOME TO OUR BANKING APPLICATION");
        System.out.println("PLEASE ENTER YOUR Full NAME: ");
        input1.nextLine();
        System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER");
        input2.nextDouble();
        System.out.println("Welcome " + input1);
        System.out.println("Your Account Number: " + input2);
    }
    public void displayService(){
        System.out.println("Please Choose One Of The Letters To Use Our Services ");
        System.out.println("A : For Checking Your Current Balance ");
        System.out.println("B : To BankApplication.Deposit An Amount Of Money ");
        System.out.println("C : To BankApplication.Withdraw An Amount Of Money ");
        System.out.println("D : Exit" );
    }

}
