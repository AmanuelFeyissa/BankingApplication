package BankApplication;

import java.util.Scanner;

public class Withdraw {
    /*
        TODO Display how much many they want to withdraw starting from 100 - 3000 100 200 500 700 1000 1200 1500 1800 2000 2300 2700 3000
        TODO or specify     DONE
        TODO let the the withdraw happen if the amount they asked is equal or less than what they have in their account
        TODO try rejecting withdrawal if the current amount is less than 25
     */
    static void displayWithdraw(){

        System.out.println("Please choose from the given amounts below: ");
        System.out.println("1. 100 Birr");
        System.out.println("2. 200 Birr");
        System.out.println("3. 500 Birr");
        System.out.println("4. 700 Birr");
        System.out.println("5. 1000 Birr");
        System.out.println("6. 1200 Birr");
        System.out.println("7. 1500 Birr");
        System.out.println("8. 1800 Birr");
        System.out.println("9. 2000 Birr");
        System.out.println("10. 2300 Birr");
        System.out.println("11. 2700 Birr");
        System.out.println("12. 3000 Birr");
        System.out.println("Specify Birr: ");
    }
    static void askWithdraw(){
        Scanner specifyNum = new Scanner(System.in);

            if(balance > 25){
        double[] ch = new double[12];
        if (ch[0] == 1) {
            System.out.println("100 Birr has been Credited from your account.");
        } else if (ch[1] == 2) {
            System.out.println("200 Birr has been Credited from your account.");
        } else if (ch[2] == 3) {
            System.out.println("500 Birr has been Credited from your account.");
        } else if (ch[3] == 4) {
            System.out.println("700 Birr has been Credited from your account.");
        } else if (ch[4] == 5) {
            System.out.println("1000 Birr has been Credited from your account.");
        } else if (ch[5] == 6) {
            System.out.println("1200 Birr has been Credited from your account.");
        } else if (ch[6] == 7) {
            System.out.println("1500 Birr has been Credited from your account.");
        } else if (ch[7] == 8) {
            System.out.println("1800 Birr has been Credited from your account.");
        } else if (ch[8] == 9) {
            System.out.println("2000 Birr has been Credited from your account.");
        } else if (ch[9] == 10) {
            System.out.println("2300 Birr has been Credited from your account.");
        } else if (ch[10] == 11) {
            System.out.println("2700 Birr has been Credited from your account.");
        } else if (ch[11] == 12) {
            System.out.println("3000 Birr has been Credited from your account.");
        } else if (ch[12] == 13) {
            System.out.println("Specify a Number Please: ");
            specifyNum.nextDouble();
        } else {
            System.out.println("Invalid input");
        }
    }else{
                System.out.println("Your Balance is Insufficient.");
            }
}
