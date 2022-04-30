import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.0");

        String nome;
        float nota1, nota2, nota3, media;

        System.out.print("Digite seu nome: ");
        nome = leitor.next();
        System.out.print("Digite sua primeira nota: ");
        nota1 = leitor.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        nota2 = leitor.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Parabens o aluno " + nome + " Foi aprovado com média " + decimal.format(media));
        }
        if (media <= 5) {
            System.out.println("O aluno " + nome + " Foi reprovado com média " + decimal.format(media));
        } else if (media >= 5.1 || media <= 6.9) {
            System.out.println("O aluno " + nome + " ficou de recuperação com média " + decimal.format(media));
        }
    }
}
