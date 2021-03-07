package BankApplication;

import java.util.Scanner;

class DisplayPage {

    public void welcomePage() {
        /* TODO put concatenation and name variable on LINE 17
           TODO put concatenation and Account number variable on LINE 18
         */
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("WELCOME TO OUR BANKING APPLICATION");
        System.out.println("PLEASE ENTER YOUR Full NAME: ");
        String accHolderName = input1.nextLine();
        System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER");
        double accHolderNum = input2.nextDouble();
        System.out.println("Welcome " + accHolderName);
        System.out.println("Your Account Number: " + accHolderNum);
    }
    public void displayService(){

            System.out.println("Please Choose One Of The Letters To Use Our Services ");
            System.out.println("A : For Checking Your Current Balance ");
            System.out.println("B : To Deposit An Amount Of Money ");
            System.out.println("C : To Withdraw An Amount Of Money ");
            System.out.println("D : Exit" );

            Scanner opt = new Scanner(System.in);

        switch (){
            case 'A':

                break;
            case 'B':
                Deposit dep = new Deposit();


        }
    }

}


