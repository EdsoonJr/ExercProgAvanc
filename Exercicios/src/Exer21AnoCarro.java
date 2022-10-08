import java.util.Scanner;

public class Exer21AnoCarro {
    
    public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		
		int maior_ano = 0; 
		double maior_velocidade = 0;
		int[] ano = new int[4]; 
		double[] velocidade = new double[4]; 
		
		int i; 
		
		for(i = 1; i < ano.length; i++) {
			
			System.out.printf("Digite o [%d] ano do seu carro novo: ", i, ano[i]);
			ano[i] = ler.nextInt();
			
			System.out.printf("Digite a [%d] velocidade do seu carro novo: ", i, velocidade[i]);
			velocidade[i] = ler.nextDouble();
            ler.close();
			
			if(ano[i] > maior_ano) {
				
				maior_ano = ano[i];
			}
			
			if(velocidade[i] > maior_velocidade) {
				
				maior_velocidade = velocidade[i];
			}
		}
		
		System.out.printf("O Maior ano do seu carro é: [%d] \n", maior_ano); 
		System.out.printf("A Maior Velocidade do seu carro é de: [%.2f] \n", maior_velocidade);
	}
}
