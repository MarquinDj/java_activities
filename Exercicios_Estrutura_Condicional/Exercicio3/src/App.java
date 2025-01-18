import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if ( x % y == 0 || y % x == 0 ){
            System.out.println("São Mútiplos");
        }

        else{
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
