import java.util.*;




public class ATMManagementSystem {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int userpin;
        Atm atm = new Atm();
        boolean loggedin = false;

        for (int i = 1; i <= 3; i++) {
            System.out.println("==============================");
            System.out.println("          ATM Login           ");
            System.out.println("==============================");
            System.out.print("Please Enter Pin = ");
            userpin = sc.nextInt();
            if (atm.login(userpin)) {
                loggedin = true;
                System.out.println("WELCOME !");
                if (loggedin) {
                    while (true) {
                        System.out.println("==============================");
                        System.out.println("          ATM Menu           ");
                        System.out.println("==============================");
                        System.out.println("1.Show Balance ");
                        System.out.println("2.WithDraw Money ");
                        System.out.println("3.Deposit Money ");
                        System.out.println("4.Change PIN ");
                        System.out.println("5.Exit");
                        System.out.println("==============================");
                   

                        System.out.print("Enter Your Choice :");

                        int ch = sc.nextInt();
                         System.out.println();
                        if (ch>=1 &&ch <= 5) {

                            switch (ch) {
                                case 1:

                                    atm.showBalance();
                                    break;
                                case 2:
                                    System.out.print("Enter The Amount = ");
                                    double amount = sc.nextDouble();
                                    atm.withdrawMoney(amount);
                                    break;
                                case 3:
                                    System.out.print("Enter The Amount = ");
                                    amount = sc.nextDouble();
                                    atm.depositMoney(amount);
                                    break;
                                case 4:
                                    System.out.println("Pin Must Be  Only In Numberic  ");
                                    System.out.print("Enter current  Pin =");
                                    int currentpin=sc.nextInt();
                                    System.out.print("Enter New Pin =");
                                    int newpin=sc.nextInt();
                                    System.out.print("Re Confirm Pin =");
                                    int confirmpin=sc.nextInt();
                                    atm.changePin( currentpin , newpin ,  confirmpin);
                                    
                                    break;
                                case 5:
                                    System.out.println("Thank You !");
                                    return;


                                default:
                                    System.out.println("\u001B[31m"+"Invalid Choice "+ "\u001B[0m");

                            }

                        } else {
                            System.out.println("\u001B[31m"+"Please Enter Choice Between 1 to 4 only !"+ "\u001B[0m");
                        }
                    }

                }

                System.out.println();
                break;
            } else {
                System.out.println("\u001B[31m"+"Attempt Left " + (3 - i)+ "\u001B[0m");
                System.out.println();
                 System.out.println();
            }

        }
        if (!loggedin) {
            System.out.println("\u001B[31m"+"Card Block "+ "\u001B[0m");
        }
         System.out.println();

        sc.close();
    }

}
