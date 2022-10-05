import java.util.Scanner;

/* Supondo que a população de um país A seja recebido via teclado em uma
variável com dupla precisão (double) representando a população atual daquele país
que possui uma taxa anual de crescimento de 3% a.a. o que a população de um */

public class Exer16Populacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Taxa do pais A ");
        double popA = ler.nextDouble();

        System.out.println("Digite a Taxa do pais  ");
        double popB = ler.nextDouble();
        ler.close();

        int cont = 0;

        while (popB > popA) {
            popA += popA * 0.03;
            popB += popB * 0.015;
            cont++;
        }

        System.out.println(cont + " Anos");
    }
}
