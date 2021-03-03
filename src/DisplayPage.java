import java.util.Scanner;

abstract class DisplayPage {

    static void welcomePage(){
        /* TODO put concatenation and name variable on LINE 18
           TODO put concatenation and Account number variable on LINE 19
         */
        Scanner input = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("WELCOME TO OUR BANKING APPLICATION");
        System.out.println("PLEASE ENTER YOUR Full NAME: ");
        /*INPUT GOES HERE*/ input.nextLine();
        System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER");
        /*INPUT GOES HERE*/ input.nextDouble();
        System.out.println("Welcome " /*concat and name*/ );
        System.out.println("Your Account Number: " /*concat and account number*/ );

        System.out.println("Please Choose One Of The Letters To Use Our Services ");
        System.out.println("A : For Checking Your Current Balance ");
        System.out.println("B : To Deposit An Amount Of Money ");
        System.out.println("C : To Withdraw An Amount Of Money ");
        System.out.println("D : Exit" );
    }
}
