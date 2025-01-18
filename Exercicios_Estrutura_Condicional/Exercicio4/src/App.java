import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int to = sc.nextInt();
        int t = sc.nextInt();

        if ( t > to ){
            System.out.printf("O JOGO DUROU %d HORAS", Math.abs(t - to));
        }

        else{
            System.out.printf("O JOGO DUROU %d HORAS", 24 - Math.abs(t - to));
        }

        sc.close();
    }
}
