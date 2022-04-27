import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        DecimalFormat decimal = new DecimalFormat("#.00");
        Scanner leitor = new Scanner(System.in);

        float valorDepositado;
        float jurosCalculado;
        float valorTotalMensal;

        System.out.print("Digite o valor depositado: ");
        valorDepositado = leitor.nextFloat();

        jurosCalculado = (float) (valorDepositado * (0.07 / 100));
        valorTotalMensal = valorDepositado + jurosCalculado;

        System.out.println("juros de 0,07% ao mês");
        System.out.println("Valor mensal com juros: " + decimal.format(valorTotalMensal));

    }
}
