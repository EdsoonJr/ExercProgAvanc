import java.util.Scanner;

public class Exer26Altura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
           float altura;
           int idade;
   
           System.out.println("Informe a altura : ");
           altura = ler.nextFloat();
           System.out.println("Informe a idade : ");
           idade = ler.nextInt();
   
           ler.close();
   
           for(int cont=0 ; cont < 1 ; cont++){
               cont = 0;
                       
           if ((altura >= 1.4) && (idade >= 14)) {
               cont = cont+1;           
           }
           if ((altura >= 1.5) && (idade >= 12)) {
               cont = cont+1;
           }
           if ((altura >= 1.7) || (idade >= 16)) {
               cont = cont+1;      
           }
           System.out.println("");
           System.out.println(cont);
   
           }      
       }
}
