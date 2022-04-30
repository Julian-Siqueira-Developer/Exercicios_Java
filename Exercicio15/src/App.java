import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int numero;
        System.out.print("Digite o numero: ");
        numero = leitor.nextInt();

        if (numero > 100 && numero < 200) {
            System.out.println("Esta no intervalo!!");
        } else {
            System.out.println("Não esta no intervalo");
        }
    }
}
