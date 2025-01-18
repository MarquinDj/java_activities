package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Student[] vect = new Student[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            double g1 = sc.nextDouble();
            double g2 = sc.nextDouble();

            vect[i] = new Student(name, g1, g2);

        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < vect.length; i++) {
            if ((vect[i].getG1() + vect[i].getG2()) / 2.0 >= 6.0) {
                System.out.println(vect[i].getName());
                
            }
        }

        sc.close();
    }
}
