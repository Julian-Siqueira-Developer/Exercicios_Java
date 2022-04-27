import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        DecimalFormat decimal = new DecimalFormat("#.00");
        Scanner leitor = new Scanner(System.in);

        float valueProduct;
        float valueParcel;

        System.out.print("Digite o valor do produto: ");
        valueProduct = leitor.nextFloat();

        valueParcel = valueProduct / 5;

        System.out.println("LOJA MAMÃO COM AÇUCAR");
        System.out.println("5 parcelas de: " + decimal.format(valueParcel));

    }
}
