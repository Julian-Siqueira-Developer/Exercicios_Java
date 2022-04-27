import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {

        DecimalFormat decimal = new DecimalFormat("#.0");
        Scanner leitor = new Scanner(System.in);
        float celsius;
        float fahrenheit;
        float kelvin;

        System.out.print("Digite o a temperatura em Celsius: ");
        celsius = leitor.nextFloat();

        fahrenheit = (9 * celsius + 160) / 5;
        kelvin = celsius + 273;

        System.out.println("Valor em Celsius: " + decimal.format(celsius) + " ºC");
        System.out.println("Valor convertido para Fahrenheit: " + decimal.format(fahrenheit) + " ºF");
        System.out.println("Valor convertido para Kelvin: " + decimal.format(kelvin) + " ºK");

    }
}
