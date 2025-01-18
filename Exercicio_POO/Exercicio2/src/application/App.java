package application;

import entities.employee;
import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee x;

        x = new employee();
        
        System.out.printf("Name: ");
        x.name = sc.nextLine();
        System.out.printf("Gross Salary: ");
        x.grossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        x.tax = sc.nextDouble();

        System.out.println(x);

        System.out.printf("Which percentage to increase salary? ");
        double increase = sc.nextDouble();

        x.increaseSalary(increase);

        System.out.println(x);
    }
}
