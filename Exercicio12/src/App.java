import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.InputMap;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");

        float valueFactory;
        float valueNew;
        float valueWithImpost;
        float percentDistribuid;
        float percentImpost;
        float acrescimoImpost;
        float acrescimoDistribuid;

        System.out.print("Digite o valor de fabrica: R$ ");
        valueFactory = leitor.nextFloat();

        System.out.print("Digite o percentual de impostos: ");
        percentImpost = leitor.nextFloat();

        System.out.print("Digite o percentual de distribuidor: ");
        percentDistribuid = leitor.nextFloat();

        acrescimoImpost = valueFactory * (percentImpost / 100);
        valueWithImpost = valueFactory + acrescimoImpost;
        acrescimoDistribuid = valueWithImpost * (percentDistribuid / 100);
        valueNew = valueWithImpost + acrescimoDistribuid;

        System.out.println("Valor de fabrica com percentual de imposto: R$ " + decimal.format(valueWithImpost));
        System.out.println("Valor de fabrica com percentual de imposto + distribuidor: R$ " + decimal.format(valueNew));

    }
}
