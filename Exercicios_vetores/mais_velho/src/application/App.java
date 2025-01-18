package application;

import entities.Student;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Student[] vect = new Student[n];

        for (int i = 0; i < vect.length; i++) {
            
            System.out.printf("Dados da %da pessoa\n", i+1);

            System.out.printf("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Idade: ");
            int age = sc.nextInt();

            vect[i] = new Student(name, age);
        }

        String older = vect[0].getName();
        int age = vect[0].getAge();

        for (int i = 1; i < vect.length; i++) {
            if (vect[i].getAge() > age) {
                age = vect[i].getAge();
                older = vect[i].getName();  
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", older);
        
        sc.close();
    }
}
