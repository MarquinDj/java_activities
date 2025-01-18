import java.util.Locale;

public class Main {

    public static void main(String[] args) {


        double y = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.println(y);
        System.out.printf("%.2f%n", y);
        System.out.printf("%.4f%n", y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", y);
        System.out.println("RESULTADO =  " + y + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", y);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


    }

}
