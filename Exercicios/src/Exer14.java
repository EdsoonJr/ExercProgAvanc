import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 1 número:");
        int numero = ler.nextInt();
        ler.close();

        int cont = 0;
        while ( cont < 6) {
            if (numero % 2 != 0) {
                System.out.println(numero);
                cont++;
            }
            numero++;
        }
    }
}
