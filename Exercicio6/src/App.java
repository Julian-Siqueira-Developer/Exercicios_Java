import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroA;
        int numeroB;
        int troca;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        numeroA = leitor.nextInt();

        System.out.print("Digite o numero 2: ");
        numeroB = leitor.nextInt();

        troca = numeroA;
        numeroA = numeroB;
        numeroB = troca;

        System.out.println("#################################");
        System.out.println("Numeros trocados");
        System.out.println("Numero 1: " + numeroA);
        System.out.println("Numero 2: " + numeroB);

    }
}
