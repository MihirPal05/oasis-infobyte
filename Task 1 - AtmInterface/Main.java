import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Interfacee a = new Implementation();

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO ATM");
        System.out.println("Enter Your ID");
        int id = sc.nextInt();

        System.out.println("Enter Your Password");
        int pass = sc.nextInt();

        if (check_id_pass(id, pass)) {
            while (true) {

                System.out.println("Enter 1:- Transaction History");
                System.out.println("Enter 2:- Withdraw Amount");
                System.out.println("Enter 3:- Deposit Amount");
                System.out.println("Enter 4:- Transfer Amount");
                System.out.println("Enter 5:- View Balance");
                System.out.println("enter 6:- Exit");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        a.for_transactionHistory();
                        break;

                    case 2:
                        System.out.println("Enter Amount: ");
                        double withdrawAmount = sc.nextDouble();
                        a.for_withdraw(withdrawAmount);

                        break;

                    case 3:
                        System.out.println("Enter Amount: ");
                        double depositAmount = sc.nextDouble();
                        a.for_deposit(depositAmount);

                        break;

                    case 4:
                        System.out.println("Enter ID: ");
                        int tranID = sc.nextInt();
                        if (tranID == 1234) {
                            System.out.println("Enter Amount To Transfer");
                            double transferAmount = sc.nextDouble();
                            a.for_transfer(transferAmount);
                            System.out.println("SUCCESSFULLY TRANSFERED");
                            a.for_viewBalance();
                        } else {
                            System.out.println("Invalid ID");
                        }
                        break;

                    case 5:
                        a.for_viewBalance();
                        break;

                    case 6:
                        System.out.println("THANK YOU FOR USING ATM MACHINE");
                        System.exit(0);
                        break;

                }
            }
        } else {
            System.out.println("INVALID USERID OR PIN");
        }

    }

    public static boolean check_id_pass(int id, int pass) {
        if (id == 1111 && pass == 0000) {
            return true;
        } else {
            return false;
        }
    }
}