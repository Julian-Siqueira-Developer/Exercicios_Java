import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");

        float cotacaoDolar;
        int qtdDolar;
        float valorReal;

        System.out.print("Digite a cotação do dolar: ");
        cotacaoDolar = leitor.nextFloat();

        System.out.print("Digite a quantidade de dolares que possue: ");
        qtdDolar = leitor.nextInt();

        valorReal = cotacaoDolar * qtdDolar;

        System.out.print("Valor em Real: R$ " + decimal.format(valorReal));

    }
}
