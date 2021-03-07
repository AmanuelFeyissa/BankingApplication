package BankApplication;

import java.util.Scanner;

public class Withdraw extends Balance{
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
    void askWithdraw() {
        Scanner specifyNum = new Scanner(System.in);
        Scanner option = new Scanner(System.in);

        int valueOption = option.nextInt();
        double specificNum = specifyNum.nextDouble();
       // if (super.balance > 25 && ) {
            double[] ch = new double[12];
            switch (valueOption){
                case 1:
                    System.out.println("100 Birr has been Credited from your account.");
                    break;
                case 2:
                    System.out.println("200 Birr has been Credited from your account.");
                    break;
                case 3:
                    System.out.println("500 Birr has been Credited from your account.");
                    break;
                case 4:
                    System.out.println("700 Birr has been Credited from your account.");
                    break;
                case 5:
                    System.out.println("1000 Birr has been Credited from your account.");
                    break;
                case 6:
                    System.out.println("1200 Birr has been Credited from your account.");
                    break;
                case 7:
                    System.out.println("1500 Birr has been Credited from your account.");
                    break;
                case 8:
                    System.out.println("1800 Birr has been Credited from your account.");
                    break;
                case 9:
                    System.out.println("2000 Birr has been Credited from your account.");
                    break;
                case 10:
                    System.out.println("2300 Birr has been Credited from your account.");
                    break;
                case 11:
                    System.out.println("2700 Birr has been Credited from your account.");
                    break;
                case 12:
                    System.out.println("3000 Birr has been Credited from your account.");
                    break;
                case 13:
                    System.out.println("Specify a Number Please: " + specificNum);
                    break;

                default:
                    System.out.println("Invalid input");
            }

    }
}
