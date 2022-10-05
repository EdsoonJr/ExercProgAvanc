import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Transporte transporte1 = new Transporte();

        System.out.println("Digite os Dados do Carro: ");
        System.out.print("Modelo:");
        transporte1.gravaModelo(ler.nextLine());
        System.out.print("Ano:");
        transporte1.setAno(ler.nextInt());
        System.out.print("Carga Máxima: ");
        transporte1.setCarga_maxima(ler.nextDouble());
        System.out.print("Potência: ");
        transporte1.setPotencia(ler.nextDouble());
        ler.close();

        System.out.println("\n");
        System.out.println("Id: " + transporte1.getId());
        System.out.println("Modelo: " + transporte1.leiaModelo());
        System.out.println("Ano: " + transporte1.getAno());
        System.out.println("Consumo : " + transporte1.consumo());
    }
}
