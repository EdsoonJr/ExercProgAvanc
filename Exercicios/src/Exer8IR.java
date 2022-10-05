import java.util.Scanner;

/* 8. Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal
a partir das rendas do Homem (RH) e da Mulher (RM). O imposto é calculado sobre
a renda conjunta (RC=RH+RM) de acordo com a tabela abaixo: */
public class Exer8IR {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a Renda do Homem R$ ");
        double rendaHomem = ler.nextDouble();
        System.out.print("Digite a Renda da Mulher R$ ");
        double rendaMulher = ler.nextDouble();
        ler.close();

        double rendaConjunta = rendaHomem + rendaMulher;
        double aliquota;
        String aliquotaImpress;

        if (rendaConjunta <= 900.00) {
            aliquota = 0;
            aliquotaImpress = "0%";
        }else  if (rendaConjunta <= 1500.00) {
            aliquota = 0.10;
            aliquotaImpress = "10%";
        }else if (rendaConjunta <= 2500.0) {
            aliquota = 0.15;
            aliquotaImpress = "15%";
        }else{
            aliquota = 0.25;
            aliquotaImpress = "25%";
        }

        double impostoRenda = rendaConjunta*aliquota;
        double rendaLiquida = rendaConjunta - impostoRenda;

        System.out.println("\n\n");
        System.out.printf("Renda Conjunta: R$ %.2f \n",rendaConjunta);
        System.out.println("Alíquota Utilizada: " + aliquotaImpress );
        System.out.printf("Imposto de Renda: R$ %.2f \n",impostoRenda );
        System.out.printf("Renda Liquida: R$ %.2f ",rendaLiquida);

    }
}