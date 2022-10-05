import java.util.Scanner;
// 2. Escreva um programa que leia o número de um funcionário, seu número de horas
// trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A
// seguir, mostre o número e o salário do funcionário, com duas casas decimais.
public class Exer2CalcSal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("<------Cálculo Salarial de Funcionário------>");

        System.out.print("Digite Seu Número:");
        int numFunc = ler.nextInt();

        System.out.print("Digite a Horas Trabalhadas:");
        int horasTraba = ler.nextInt();

        System.out.println("Digite o Valor da Hora");
        double valorHora = ler.nextDouble();
        ler.close();

        if (horasTraba < 0 && valorHora < 0) {
            System.out.println("Horas Trabalhadas ou Valor Digitados Incorretamente");
        }else{
            System.out.println("Número do Funcionário: " + numFunc);
            System.out.println("Salário = R$ "+ horasTraba*valorHora);
        }
    }
}
