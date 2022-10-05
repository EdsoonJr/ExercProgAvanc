import java.util.Arrays;
import java.util.Scanner;
/* 5. Faça um programa que leia do teclado três valores inteiros e exiba-os em ordem
        crescente. */
public class Exer5Cresc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o "+(i+1)+"° Número");
            numeros[i] = ler.nextInt();
        }
        ler.close();

        Arrays.sort(numeros);
        System.out.println("------> ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
    
}