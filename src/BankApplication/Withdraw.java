package BankApplication;

import java.util.Scanner;
// Plan for next year
public class Withdraw extends Balance {

    public void askWithdraw() {
        double[] ch = new double[]{100, 200, 500, 700, 1000, 1200, 1500, 1800, 2000, 2300, 2700, 3000,0};

        if ((super.balance > 25) && ((ch[0] <= super.balance) || (ch[1] <= super.balance) || (ch[2] <= super.balance)
                || (ch[3] <= super.balance) || (ch[4] <= super.balance) || (ch[5] <= super.balance) || (ch[6] <= super.balance)
                || (ch[7] <= super.balance) || (ch[8] <= super.balance) || (ch[9] <= super.balance) || (ch[10] <= super.balance)
                || (ch[11] <= super.balance) || (ch[12] <= super.balance))) {

            Scanner option = new Scanner(System.in);
            int valueOption = option.nextInt();
            switch (valueOption) {
                case 1:
                    super.balance = super.balance - ch[0];
                    System.out.println("\t\t\t\t\t100 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    super.balance = super.balance - ch[1];
                    System.out.println("\t\t\t\t\t200 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    super.balance = super.balance - ch[2];
                    System.out.println("\t\t\t\t\t500 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    super.balance = super.balance - ch[3];
                    System.out.println("\t\t\t\t\t700 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 5:
                    super.balance = super.balance - ch[4];
                    System.out.println("\t\t\t\t\t1000 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 6:
                    super.balance = super.balance - ch[5];
                    System.out.println("\t\t\t\t\t1200 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 7:
                    super.balance = super.balance - ch[6];
                    System.out.println("\t\t\t\t\t1500 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 8:
                    super.balance = super.balance - ch[7];
                    System.out.println("\t\t\t\t\t1800 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 9:
                    super.balance = super.balance - ch[8];
                    System.out.println("\t\t\t\t\t2000 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 10:
                    super.balance = super.balance - ch[9];
                    System.out.println("\t\t\t\t\t2300 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 11:
                    super.balance = super.balance - ch[10];
                    System.out.println("\t\t\t\t\t2700 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 12:
                    super.balance = super.balance - ch[11];
                    System.out.println("\t\t\t\t\t3000 Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 13:
                    Scanner specifyNum = new Scanner(System.in);
                    System.out.print("\t\t\t\t\tSpecify a Number Please: ");
                    ch[12] = specifyNum.nextDouble();
                    super.balance = super.balance - ch[12];
                    System.out.println("\t\t\t\t\t" + super.balance + " Birr has been Credited from your account.");
                    currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                default:
                    System.out.println("\t\t\t\t\tInvalid input");
            }
        }
    }
}
