package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);


        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Empréstimo");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


        Account acco = new Account(1001, "Alex", 1000.0);
        acco.withdraw(200.0);
        System.out.println(acco.getBalance());

        Account acco2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acco2.withdraw(200.0);
        System.out.println(acco2.getBalance());

        Account acco3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acco3.withdraw(200.0);
        System.out.println(acco3.getBalance());

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}