import java.util.Scanner;

public class Exer6Consumo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Distância em Km:");
        int distancia = ler.nextInt();

        System.out.println("Digite o Total de Combustivel em Litros(00.0):");
        double combustivel = ler.nextDouble();
        ler.close();

        double consumo = distancia/combustivel;
        System.out.printf("Consumo Médio do Automovel: %.3f",consumo);
        System.out.print(" Km/l");
    }
    
}