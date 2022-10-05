import java.util.Scanner;

/* A sequência de números 0 1 1 2 3 5 6 8 13 21 ... é conhecida como série de
Fibonacci. Nesta sequência, cada número, depois dos 2 primeiros, é igual à soma
dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N
primeiros números dessa série. */

public class Exer15Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 1 número:");
        int numero = ler.nextInt();
        int prox,ant = 0,atual = 1;
        ler.close();

        for (int i = 0; i < numero; i++) {
            if (i == numero) {
                System.out.print(ant);
            }else{
                System.out.print(ant + " ");
                prox = ant + atual;
                ant = atual;
                atual = prox;
            }
        }
    }
}
