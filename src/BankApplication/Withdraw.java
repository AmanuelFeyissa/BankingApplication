package BankApplication;

import java.util.Scanner;

public class Withdraw extends Balance {
    /*
        TODO Display how much many they want to withdraw starting from 100 - 3000 100 200 500 700 1000 1200 1500 1800 2000 2300 2700 3000
        TODO or specify     DONE
        TODO let the the withdraw happen if the amount they asked is equal or less than what they have in their account
        TODO try rejecting withdrawal if the current amount is less than 25
     */


    void askWithdraw() {
        Scanner specifyNum = new Scanner(System.in);
        Scanner option = new Scanner(System.in);
        double[] ch = new double[]{100, 200, 500, 700, 1000, 1200, 1500, 1800, 2000, 2300, 2700, 3000,5};

        int valueOption = option.nextInt();
        ch[12] = specifyNum.nextDouble();

        if ((super.balance > 25) && (ch[0] <= super.balance) && (ch[1] <= super.balance) && (ch[2] <= super.balance)
                && (ch[3] <= super.balance) && (ch[4] <= super.balance) && (ch[5] <= super.balance) && (ch[6] <= super.balance)
                && (ch[7] <= super.balance) && (ch[8] <= super.balance) && (ch[9] <= super.balance) && (ch[10] <= super.balance)
                && (ch[11] <= super.balance) && (ch[12] <= super.balance)) {
            switch (valueOption) {
                case 1:
                    super.balance = super.balance - ch[0];
                    System.out.println("100 Birr has been Credited from your account.");
                    break;
                case 2:
                    super.balance = super.balance - ch[1];
                    System.out.println("200 Birr has been Credited from your account.");
                    break;
                case 3:
                    super.balance = super.balance - ch[2];
                    System.out.println("500 Birr has been Credited from your account.");
                    break;
                case 4:
                    super.balance = super.balance - ch[3];
                    System.out.println("700 Birr has been Credited from your account.");
                    break;
                case 5:
                    super.balance = super.balance - ch[4];
                    System.out.println("1000 Birr has been Credited from your account.");
                    break;
                case 6:
                    super.balance = super.balance - ch[5];
                    System.out.println("1200 Birr has been Credited from your account.");
                    break;
                case 7:
                    super.balance = super.balance - ch[6];
                    System.out.println("1500 Birr has been Credited from your account.");
                    break;
                case 8:
                    super.balance = super.balance - ch[7];
                    System.out.println("1800 Birr has been Credited from your account.");
                    break;
                case 9:
                    super.balance = super.balance - ch[8];
                    System.out.println("2000 Birr has been Credited from your account.");
                    break;
                case 10:
                    super.balance = super.balance - ch[9];
                    System.out.println("2300 Birr has been Credited from your account.");
                    break;
                case 11:
                    super.balance = super.balance - ch[10];
                    System.out.println("2700 Birr has been Credited from your account.");
                    break;
                case 12:
                    super.balance = super.balance - ch[11];
                    System.out.println("3000 Birr has been Credited from your account.");
                    break;
                case 13:
                    System.out.println("Specify a Number Please: " + ch[12]);
                    super.balance = super.balance - ch[12];
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
