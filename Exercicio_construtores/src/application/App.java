package application;

import entities.Bank;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank account;

        System.out.printf("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter account holder: ");
        String name = sc.nextLine();

        account = new Bank(name, number);

        System.out.printf("Is there na initial deposit (y/n)? ");
        char valid = sc.next().charAt(0);

        if (valid == 'y') {
            System.out.printf("Enter initial deposit value: ");
            double inicialDeposit = sc.nextDouble();
            account.inicialDeposit(inicialDeposit);
            
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.print("Updated account data: ");
        System.out.println(account);


        sc.close();

    }
}
