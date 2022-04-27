import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("#.0");
        Scanner leitor = new Scanner(System.in);
        float consumoMedio;
        float distanciaTotal;
        float combustivelTotal;

        System.out.print("Digite a distancia Total: ");
        distanciaTotal = leitor.nextFloat();

        System.out.print("Digite o combustivel Total: ");
        combustivelTotal = leitor.nextFloat();

        consumoMedio = (distanciaTotal / combustivelTotal);

        System.out.println("consumo medio é: " + decimal.format(consumoMedio) + " Km por litro");
    }

}