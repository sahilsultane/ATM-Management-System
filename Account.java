public class Account {
    private double balance;
   protected int pin;

    Account() {
        balance = 1000;
        pin = 123456;
    }

    boolean login(int enterpin) {

        if (enterpin == pin) {
            System.out.println("\u001B[32m"+"Login Successfully"+"\u001B[0m");
            System.out.println();
            return true;
        } else {
            System.out.println("\u001B[31m" +"Incorrect Pin "+ "\u001B[0m");
            System.out.println();
            return false;
        }
    }

    void showBalance() {
        System.out.println("Current Balance Is = " + balance);

    }

    void depositMoney(double amount) {
        if (amount < 1) {

            System.out.println("\u001B[31m" +"Invalid Amount"+ "\u001B[0m");

        } else {

            balance += amount;
            System.out.println("Successfully " + amount + " Diposited");
            System.out.println("Current Balance Is = " + balance);
        }

    }

    void withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Amount Cannot be In negative"+ "\u001B[0m");
        } else if (amount > balance) {
            System.out.println("\u001B[31m"+"Insufficient Balance"+ "\u001B[0m");
        } else {
            balance -= amount;
            System.out.println(amount + " Is WithDraw Successfully ");
            System.out.println("Your Current Balance Is = " + balance);
        }

    }

}