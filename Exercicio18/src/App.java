import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int idade;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade: ");
            idade = leitor.nextInt();

            if (idade >= 18) {
                System.out.println("E maior de idade");
            } else {
                System.out.println("E menor de idade");
            }
        }
    }
}
