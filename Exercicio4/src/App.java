import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("#,###.00");
        Scanner leitor = new Scanner(System.in);
        String nomeVendedor;
        float salarioFixo;
        int vendasMes;
        double salarioTotal;
        double comissaoDeCadaVenda;

        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = leitor.next();

        System.out.print("Digite o salario Fixo: ");
        salarioFixo = leitor.nextFloat();

        System.out.print("Digite a quantidade de vendas: ");
        vendasMes = leitor.nextInt();

        System.out.println("################################################");

        // 15% do salario fixo = preço de cada venda;
        comissaoDeCadaVenda = (salarioFixo * (15.0 / 100.0));
        // salario total = salariofixo + qtd vendas * preço de cada venda;
        salarioTotal = salarioFixo + (vendasMes * comissaoDeCadaVenda);

        System.out.println("Nome: " + nomeVendedor);
        System.out.println("Salario fixo: R$ " + decimal.format(salarioFixo));
        System.out.println("Comissao por cada venda efetuada: R$ " +
                decimal.format(comissaoDeCadaVenda));
        System.out.println("Salario + comissao: R$ " + decimal.format(salarioTotal));
        System.out.println("################################################");
    }
}