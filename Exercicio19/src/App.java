import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        String nome;
        char sexo;
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite seu nome: ");
            nome = leitor.next();
            System.out.println("Digite seu sexo: ");
            sexo = leitor.next().charAt(0);

            if (sexo == 'F' || sexo == 'f') {
                System.out.println(nome + " é feminina");
                totalMulheres = totalMulheres + 1;
            } else {
                System.out.println(nome + " é masculino");
                totalHomens = totalHomens + 1;
            }
        }
        System.out.println("Total de mulheres: " + totalMulheres);
        System.out.println("Total de homens: " + totalHomens);
    }
}
