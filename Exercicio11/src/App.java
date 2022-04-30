import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");

        float valueBuy;
        float valueSell;
        float valuePercent;
        float valorAcrescido;

        System.out.print("Valor de compra: R$ ");
        valueBuy = leitor.nextFloat();

        System.out.print("Valor do percentual de acrescimo: ");
        valuePercent = leitor.nextFloat();

        valorAcrescido = valueBuy * (valuePercent / 100);
        valueSell = valueBuy + valorAcrescido;

        System.out.println("#####################################");
        System.out.println("Valor de Venda: R$ " + decimal.format(valueSell));

    }
}
