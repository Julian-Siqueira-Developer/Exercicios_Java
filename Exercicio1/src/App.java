import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        n1 = leitor.nextInt();
        System.out.print("Digite outro numero: ");
        n2 = leitor.nextInt();

        System.out.println("Soma de valores é: " + (n1 + n2));
    }
}