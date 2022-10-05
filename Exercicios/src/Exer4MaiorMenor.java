import java.util.Scanner;
/* Faça um programa que leia do teclado três valores inteiros e exiba o maior e
        menor entre eles. */
public class Exer4MaiorMenor {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o 1° Número");
        int num1 = ler.nextInt();
        System.out.println("Digite o 2° Número");
        int num2 = ler.nextInt();
        System.out.println("Digite o 3° Número");
        int num3 = ler.nextInt();
        ler.close();

        int maior = num1;
        int menor = num1;

        if (maior < num2) {
            maior = num2;
        }else if (maior < num3) {
            maior = num3;
        }

        if (menor > num2) {
            menor = num2;
        }else if (menor > num3) {
            menor = num3;
        }



        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
