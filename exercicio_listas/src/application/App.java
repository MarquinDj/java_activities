package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>(); 

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.printf("Employee #%d\n", i + 1);
            System.out.printf("Id: ");
            int id = sc.nextInt();
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            Double salary = sc.nextDouble();

            Employee e = new Employee(id, name, salary);
            list.add(e);

        }

        System.err.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        System.err.println();

        if (list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null) == null){

            System.out.println("This id does not exist!\r");

                
        }

        else{

            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();

           list.stream().filter(x -> x.getId() == idIncrease).forEach(x -> x.increaseSalary(percentage));
            
                
        }
        System.out.println();

        System.out.println("List of employees: ");

        for(Object x : list){

            System.out.println(x);
        }


    }
}
