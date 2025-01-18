package application;
import java.util.Locale;
import java.util.Scanner;

import estities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa: \n", i+1);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);
            
        }

        double sumHeight = 0;

        for (int i = 0; i < vect.length; i++) {
            sumHeight += vect[i].getHeight();
        }

        System.out.printf("Altura média: %.2f\n", sumHeight/vect.length);

        int countUnder = 0;


        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                countUnder ++;
                
            }
        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , (double) countUnder/vect.length * 100);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
                
            }
        }
        
        sc.close();
    }
}
