import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        int numero;
        System.out.print("Digite um numero: ");
        numero = leitor.nextInt();

        if (numero > 10) {
            System.out.println("Numero maior que 10");
        }
    }
}
