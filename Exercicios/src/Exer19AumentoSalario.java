import java.util.Scanner;

public class Exer19AumentoSalario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario = 0;

        System.out.println("Digite o valor do salário:");
        salario = ler.nextDouble();
        ler.close();

        if(salario > 500){
            salario += (salario*0.1);
            
        }
        if((salario <= 500)&&(salario > 300)){
            salario += (salario*0.07);
            
        } if(salario < 300){
            salario += (salario*0.05);
            
        }
        System.out.printf("Novo Salario: "+"%.2f",salario);
    }
}
