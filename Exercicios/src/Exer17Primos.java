import java.util.Scanner;

/* Na matemática, um Número Primo é aquele que pode ser dividido somente por 1
(um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
apenas pelo número 1 e pelo número 7. */

public class Exer17Primos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Quantidade de Testes: ");
        int qtdTeste = ler.nextInt();

        for (int i = 0; i < qtdTeste; i++) {
            int cont = 1, numero;

            System.out.println("Digite o "+ (i+1) + "º numero:");
            numero = ler.nextInt();

            for (int j = 2; j < numero; j++) {
                if (numero % j == 0) {
                    cont++;
                }
            }
            if (cont == 1 && numero != 1) {
                System.out.println("O número: " + numero + " é primo");
            }else{
                System.out.println("O número: " + numero + " não é primo");
            }
            ler.close();
        }
    }
}
