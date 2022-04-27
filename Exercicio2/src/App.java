import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int n1;
        int n2;

        // DecimalFormat decimal = new DecimalFormat("#.0");
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        n1 = leitor.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = leitor.nextInt();

        System.out.println("Soma: " + (int) (n1 + n2));
        System.out.println("Subtração: " + (int) (n1 - n2));
        System.out.println("Multiplicação: " + (int) (n1 * n2));
        System.out.println("Divisão: " + (int) (n1 / n2));
    }
}