package application;

import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        System.out.printf("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            
            System.out.printf("Altura da %da pessoa: ", i+1);
            double height = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            char genre = sc.next().charAt(0);

            vect[i] = new Person(height, genre);

        }

        double lowerHeight = vect[0].getHeight();
        double higherHeight = vect[0].getHeight();

        double heightWomen = 0;
        int heightWomenCount = 0;
        int menCount = 0;


        for (int i = 0; i < vect.length; i++) {
            if (higherHeight < vect[i].getHeight()) {
                higherHeight = vect[i].getHeight();
            }

            else if (lowerHeight > vect[i].getHeight()) {
                lowerHeight = vect[i].getHeight();
            } 

            if (vect[i].getGenre() == 'F') {
                heightWomen += vect[i].getHeight();
                heightWomenCount ++;
            }

            else{
                menCount ++;
            }
        }

        System.out.printf("Menor Altura = %.2f\n", lowerHeight);
        System.out.printf("Maior Altura = %.2f\n", higherHeight);
        System.out.printf("Media das alturas das mulheres = %.2f\n", (double) heightWomen / heightWomenCount);
        System.out.printf("Numero de homens = %d", menCount);

        sc.close();
    }
}
