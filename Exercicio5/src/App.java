import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        DecimalFormat decimal = new DecimalFormat("#.0");
        Scanner leitor = new Scanner(System.in);

        String nomeAluno;
        float nota1;
        float nota2;
        float nota3;
        double media;
        System.out.print("Digite o nome do aluno: ");
        nomeAluno = leitor.next();

        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("##################################################");

        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Média do aluno: " + decimal.format(media));
    }
}
