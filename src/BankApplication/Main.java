package BankApplication;

class Main {
    double balance = 0;
    Main(double balance){
        this.balance = balance;
    }
    Main(){

    }
    /* TODO  let all the other classes inherit from this one
    `  TODO

     */
    public static void main(String[] args){
      DisplayPage display = new DisplayPage();
      display.welcomePage();
      display.displayService();


    }
}