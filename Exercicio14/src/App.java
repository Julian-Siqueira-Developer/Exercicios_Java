import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Digite o primeiro numero: ");
        numero1 = leitor.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = leitor.nextInt();

        if (numero1 > numero2) {
            System.out.println("O Numero " + numero1 + " é maior que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("O Numero " + numero2 + " é maior que " + numero1);
        } else {
            System.out.println("Numeros não sao distintos !!");
        }
    }
}
