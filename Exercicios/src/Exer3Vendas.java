import java.util.Scanner;
// 3. Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de
// vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
// 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
// do mês, com duas casas decimais.
public class Exer3Vendas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o Nome do Vendedor");
        String nomeVendedor = ler.nextLine();

        System.out.println("Digite o Salário Fixo: ");
        double salario = ler.nextDouble();

        System.out.println("Digite o Total de Vendas em R$");
        double vendas = ler.nextDouble();
        ler.close();

        double comissao = vendas*0.15;
        double total = salario + comissao;

        System.out.println("Nome do Vendedor:"+ nomeVendedor);
        System.out.println("Total:" + total);
    }
}
