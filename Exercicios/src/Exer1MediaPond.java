import java.util.Scanner;

public class Exer1MediaPond {

    public static void  CalcMediaPond(double nota1,double nota2){
        double peso1 = 3.5;
        double peso2 = 7.5;

        if (nota1 <= 10.0 && nota2 <= 10.0) {
            double mediaPond1 = nota1 * peso1;
            double mediaPond2 = nota2 * peso2;

            double mediaPondResult = (mediaPond1+mediaPond2)/(peso1+peso2);
            System.out.printf("A Média Ponderada do Aluno é = %.1f \n",mediaPondResult);
        }else{
            System.out.println("Nota Digitada é Maior que 10.0");
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("------Cálculo de Média Ponderada------");
        System.out.print("Digite a 1º Nota: ");
        double nota1 = ler.nextDouble();
        System.out.print("Digite a 2º Nota: ");
        double nota2 = ler.nextDouble();
        ler.close();

        CalcMediaPond(nota1,nota2);
        
    }
    
}