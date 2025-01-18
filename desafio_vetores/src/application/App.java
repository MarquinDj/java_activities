package application;

import entities.Pensionato;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.printf("How many rooms will be rented? ");
        
        int n = sc.nextInt();

        Pensionato[] vect = new Pensionato[10];

        for (int i = 0; i < n; i++) {

            System.out.printf("Rent #%d:\n",i+1);

            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.next();
            System.out.printf("Room: ");
            int room = sc.nextInt();

            vect[room] = new Pensionato(name, email, room);
            
        }

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] != null) {

                System.err.println(vect[i]);
                
            }
            
        }

        sc.close();
    }
}
