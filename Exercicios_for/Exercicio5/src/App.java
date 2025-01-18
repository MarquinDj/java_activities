import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int f = 1;

        for (int i = 1 ; i <= x; i++) {

            f *= i;
            
        }

        System.out.println(f);

        sc.close();
    }
}
