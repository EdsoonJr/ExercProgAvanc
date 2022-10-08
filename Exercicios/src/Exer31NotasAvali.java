import java.util.Scanner;

public class Exer31NotasAvali {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
         double nota1=0, nota2=0, media;
 
         System.out.println("Digite  a primeira nota:");
         nota1 = ler.nextDouble();

         while((nota1 < 0)||(nota1>10)){
             System.out.println("Nota inválida.");
             nota1 = ler.nextDouble();
         }
 
         System.out.println("Digite a segunda nota:");
         nota2 = ler.nextDouble();

         while((nota2 < 0)||(nota2>10)){
             System.out.println("Nota inválida.");
             nota2 = ler.nextDouble();
         }
         ler.close();

         media = (nota1+nota2)/2;
         
         System.out.println("Média ="+media);
 
     }
}
