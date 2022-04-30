import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int numero;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite um numero: ");
            numero = leitor.nextInt();
            if (numero >= 10 && numero <= 150) {
                System.out.println("Esta dentro do intervalo");
            } else {
                System.out.println("Nao esta dentro do intervalo");
            }
        }
    }
}
