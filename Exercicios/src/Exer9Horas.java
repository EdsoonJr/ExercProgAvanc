import java.util.Scanner;

/* Faça um programa que receba via teclado o tempo de duração de um evento em
uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o
expresso em horas, minutos e segundos.
 */
public class Exer9Horas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tempo,hora,minutos,segundos,resto;

        System.out.println("Digite o tempo de duração em segundos:");
        tempo = ler.nextInt();
        ler.close();

        hora = tempo / 3600;
        resto = tempo % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println("HH:MM:SS = " + hora + ":" + minutos + ":" + segundos );
    }
}