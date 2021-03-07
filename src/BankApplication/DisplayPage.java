package BankApplication;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

class DisplayPage {

    public void welcomePage() {

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t--------------------------------------------------");
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t\t\tWELCOME TO OUR BANKING APPLICATION");
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t--------------------------------------------------");
        System.out.print("\t\t\t\t\tPLEASE ENTER YOUR Full NAME: ");
        String accHolderName = input1.nextLine();
        System.out.print("\t\t\t\t\tPLEASE ENTER YOUR ACCOUNT NUMBER: ");
        long accHolderNum = input2.nextLong();
        System.out.println("\t\t\t\t\t**************************************************");
        System.out.println("\t\t\t\t\t--------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\tWelcome " + toUpperCase(accHolderName));
        System.out.println("\t\t\t\t\tYour Account Number: " + accHolderNum);
        System.out.println();
        System.out.println();
    }

    public void displayService() {

        char serviceOption;
        do {
            System.out.println("\t\t\t\t\tPlease Choose One Of The Letters To Use Our Services ");
            System.out.println("\t\t\t\t\tA : For Checking Your Current Balance ");
            System.out.println("\t\t\t\t\tB : To Deposit An Amount Of Money ");
            System.out.println("\t\t\t\t\tC : To Withdraw An Amount Of Money ");
            System.out.println("\t\t\t\t\tD : Exit");
            System.out.print("\t\t\t\t\t>>>>>>>>>>>>>>>> ");

            Scanner opt = new Scanner(System.in);
            serviceOption = opt.next().toUpperCase().charAt(0);
            switch (serviceOption) {
                case 'A':
                    Balance currentBalance = new Balance();
                    currentBalance.currentBalance();
                    System.out.println();
                    System.out.println();
                    break;
                case 'B':
                    Deposit depositAction = new Deposit();
                    depositAction.depositorInfo();
                    depositAction.askDepositAmount();
                    break;
                case 'C':
                    Withdraw withdraw = new Withdraw();
                    displayWithdraw();
                    withdraw.askWithdraw();
                    break;
                case 'D':
                    System.out.println("Thank You For Using Our Services. Good Day.");
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        } while (serviceOption != 'D');

    }
    void displayWithdraw() {

        System.out.println("\t\t\t\t\tPlease choose from the given amounts below: ");
        System.out.print("\t\t\t\t\t1. 100 Birr\t\t\t");
        System.out.println("\t\t\t\t\t7. 1500 Birr");

        System.out.print("\t\t\t\t\t2. 200 Birr\t\t\t");
        System.out.println("\t\t\t\t\t8. 1800 Birr");

        System.out.print("\t\t\t\t\t3. 500 Birr\t\t\t");
        System.out.println("\t\t\t\t\t9. 2000 Birr");

        System.out.print("\t\t\t\t\t4. 700 Birr\t\t\t");
        System.out.println("\t\t\t\t\t10. 2300 Birr");

        System.out.print("\t\t\t\t\t5. 1000 Birr\t\t");
        System.out.println("\t\t\t\t\t11. 2700 Birr");

        System.out.print("\t\t\t\t\t6. 1200 Birr\t\t");
        System.out.println("\t\t\t\t\t12. 3000 Birr");

        System.out.println("\t\t\t\t\t13.Specify Birr: ");
        System.out.println();
        System.out.print("\t\t\t\t\t>>>>>>>>>>>>>>>> ");
    }

    public static void main(String[] args){

        DisplayPage displayPage = new DisplayPage();


        Withdraw withdraw = new Withdraw();

        // DISPLAY PAGE
        displayPage.welcomePage();
        displayPage.displayService();

    }
}


