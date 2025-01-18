
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            float v1 = sc.nextFloat();
            float v2 = sc.nextFloat();

            if(v2 != 0){

                float divisao = v1/v2;
                System.out.printf("%.1f\n", divisao);
            }

            else{
                System.out.println("Divisão Impossível");
            }
        }

        sc.close();
    }
}
