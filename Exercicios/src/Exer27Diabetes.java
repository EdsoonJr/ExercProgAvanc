import java.util.Scanner;

public class Exer27Diabetes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Glicose1,Glicose2,Glicose3,Glicose4;
        double Media;
        double  soma;
   
           System.out.println("Informe o primeiro valor : ");
           Glicose1 = sc.nextInt();
           System.out.println("Informe o segundo valor : ");
           Glicose2 = sc.nextInt();
           System.out.println("Informe o terçeiro valor : ");
           Glicose3 = sc.nextInt();
           System.out.println("Informe o quarto valor : ");
           Glicose4 = sc.nextInt();
           soma = (Glicose1+Glicose2+Glicose3+Glicose4);
           Media = soma/4;
           sc.close();
   
           if ((Glicose1 > 0) && (Glicose1 <= 110)) {
               System.out.println(Glicose1+" Normal");
           }if ((Glicose1 > 110) && (Glicose1 <= 125)) {
               System.out.println(Glicose1+" Alterada");       
           }if (Glicose1 > 125){
               System.out.println(Glicose1+" Muito alta");
           }
           if (Glicose2 < 110) {
               System.out.println(Glicose2+" Normal");
           }if ((Glicose2 >= 110) && (Glicose2 <= 125)) {
               System.out.println(Glicose2+" Alterada");       
           }else {
               System.out.println(Glicose2+" Muito alta");
           }
           if (Glicose3 < 110) {
               System.out.println(Glicose3+" Normal");
           }if ((Glicose3 >= 110) && (Glicose3 <= 125)) {
               System.out.println(Glicose3+" Alterada");       
           }else {
               System.out.println(Glicose3+" Muito alta");
           }
           if (Glicose4 < 110) {
               System.out.println(Glicose4+" Normal");
           }if ((Glicose4 >= 110) && (Glicose4 <= 125)) {
               System.out.println(Glicose4+" Alterada");       
           }else {
               System.out.println(Glicose4+" Muito alta");
           }
           System.out.println("Media das leituras = "+Media);
   
       }
}
