import java.util.Scanner;
import java.text.DecimalFormat;
//import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        int anoVeiculo;
        float valorVeiculoFabrica;
        float valorASerPago;
        float desconto;
        char querContinuar = 'S';

        while (querContinuar == 'S' || querContinuar == 's') {
            System.out.println("######################################################");
            System.out.println("CARANGO VELHO");
            System.out.print("Digite o ano do veiculo: ");
            anoVeiculo = leitor.nextInt();
            System.out.print("Digite o valor: R$ ");
            valorVeiculoFabrica = leitor.nextFloat();

            if (anoVeiculo <= 2000) {
                desconto = (float) (valorVeiculoFabrica * 0.12);
                System.out.println("Valor do desconto: R$ " + decimal.format(desconto));
                valorASerPago = valorVeiculoFabrica - desconto;
                System.out.println("Valor a ser pago pelo cliente: R$ " + decimal.format(valorASerPago));
            } else {
                desconto = (float) (valorVeiculoFabrica * 0.07);
                System.out.println("Valor do desconto: R$ " + decimal.format(desconto));
                valorASerPago = valorVeiculoFabrica - desconto;
                System.out.println("Valor a ser pago pelo cliente: R$ " + decimal.format(valorASerPago));
            }
            System.out.print("Deseja continuar ? S || N: ");
            querContinuar = leitor.next().charAt(0);
        }
    }
}