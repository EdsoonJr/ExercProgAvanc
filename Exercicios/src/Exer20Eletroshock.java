import java.util.Scanner;

public class Exer20Eletroshock {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String bairro;
        double consumo,renda;

        System.out.println("Digite o Bairro: Santa Ana, Industriários, Tabatinga");
        bairro = ler.nextLine();

        System.out.println("Digite o valor da renda:");
        renda = ler.nextDouble();
        
        System.out.println("Digite o valor do consumo:");
        consumo = ler.nextDouble();

        if((renda <0)||(consumo <0)){
        do{
            System.out.println("valores de renda e consumo não devem ser negativos.");
            System.out.println("Digite o bairro: Santa Ana, Industriários, Tabatinga");
            bairro = ler.nextLine();

            System.out.println("Digite o valor da renda:");
            renda = ler.nextDouble();

            System.out.println("Digite o valor do consumo:");
            consumo = ler.nextDouble();

        }while((renda <0)||(consumo <0));
        }
        ler.close();

        switch(bairro.charAt(0)){
            case 's':
                if((renda>=50)&&(renda<=500)){
                    consumo -= 50;
                    System.out.printf("valor a pagar: "+"%.2f",consumo);
                }
                if((renda>500)&&(renda<1000)){
                    consumo -= 25;
                    System.out.printf("valor a pagar: "+"%.2f",consumo);
                }else{
                    System.out.println(consumo);
                }
                break;
            case 'i':
                if((renda>=240)&&(renda <=1000)){
                    consumo -= 240;
                    System.out.printf("valor a pagar: "+"%.2f",consumo);
                }
                if((renda>1000)&&(renda <=5000)){
                    consumo -= 120;
                    System.out.printf("valor a pagar: "+"%.2f",consumo);
                }else{
                    System.out.println(consumo);
                }
                break;
            case 't':
                if((renda>5000)&&(renda <= 10000)){
                    consumo -= 720;
                    System.out.printf("valor a pagar: "+"%.2f",consumo);
                }
                if((renda>10000)&&(renda<=20000)){
                    consumo -= 360;
                    System.out.printf("valor a pagar: "+"%.2f",consumo);
                }else{
                    System.out.println(consumo);
                }
                break;
        }

    }
}
