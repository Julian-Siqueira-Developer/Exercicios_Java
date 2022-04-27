import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        DecimalFormat decimal = new DecimalFormat("#.00");
        Scanner leitor = new Scanner(System.in);

        float valueProduct;
        float valueParcel;
        float valueTotal;

        System.out.print("Digite o valor do produto: R$ ");
        valueProduct = leitor.nextFloat();

        System.out.print("Digite o numero de parcelas que quer dividir: ");
        valueParcel = leitor.nextFloat();

        valueTotal = (valueProduct / valueParcel);

        System.out.println("#################################################");
        System.out.println("LOJA MAMÃO COM AÇUCAR");
        System.out.println(
                "Produto dividido em " + (int) valueParcel + "x parcelas de R$: " + decimal.format(valueTotal));

    }
}
