import java.util.Scanner;

/* 11. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma
duração mínima de 1 hora e máxima de 24 horas. */

public class Exer11HoraJogo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Hora inicial do jogo");
        int horaInicial = ler.nextInt();
        System.out.println("Digite a Hora final do jogo");
        int horaFinal = ler.nextInt();
        ler.close();

        if (horaInicial > horaFinal) {
            System.out.println("O Jogo Durou " + (24 - (horaInicial-horaFinal))+ " Horas");
        }else if (horaFinal > horaInicial) {
            System.out.println("O Jogo Durou" + (horaFinal-horaInicial)+ " Horas");
        }else{
            System.out.println("O jogo Durou 24 Horas");
        }

    }
}
