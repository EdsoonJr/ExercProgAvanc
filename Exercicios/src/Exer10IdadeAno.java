import java.util.Scanner;

/* 10. Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a
em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano
com 365 dias e todo mês com 30 dias. */

public class Exer10IdadeAno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua Idade em dias: ");
        int idadeDias = ler.nextInt();
        ler.close();

        int anos = idadeDias / 365;
        int mes = (idadeDias % 365) / 30;
        int dia = (idadeDias % 365) % 30;

        System.out.println("\n");
        System.out.println(anos + " Ano(s)" );
        System.out.println(mes + " Mês(es)");
        System.out.println(dia + " Dia(s)");
    }
}
