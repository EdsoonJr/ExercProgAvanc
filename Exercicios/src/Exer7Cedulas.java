import java.util.Scanner;

/* 7. Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
(cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100,
50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias. */

public class Exer7Cedulas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um Valor R$");
        int valorInserido = ler.nextInt();
        ler.close();

        int valorAtual = valorInserido;
        int cedula100 = valorAtual/100;
        valorAtual -= cedula100 * 100;
        int cedula50 = valorAtual / 50;
        valorAtual -= cedula50 * 50;
        int cedula20 = valorAtual / 20;
        valorAtual -= cedula20 * 20;
        int cedula10 = valorAtual / 10;
        valorAtual -= cedula10 * 10;
        int cedula5 = valorAtual / 5;
        valorAtual -= cedula5 * 5;
        int cedula2 = valorAtual / 2;
        valorAtual -= cedula2 * 2;
        int cedula1 = valorAtual / 1;
        valorAtual -= cedula1 * 1;

        System.out.println(cedula100 + " Nota(s) de R$100");
        System.out.println(cedula50 + " Nota(s) de R$50");
        System.out.println(cedula20 + " Nota(s) de R$20");
        System.out.println(cedula10 + " Nota(s) de R$10");
        System.out.println(cedula5 + " Nota(s) de R$5");
        System.out.println(cedula2 + " Nota(s) de R$2");
        System.out.println(cedula1 + " Nota(s) de R$1");


    }
}