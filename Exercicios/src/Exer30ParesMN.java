import java.util.Scanner;

public class Exer30ParesMN {
    public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d;
		boolean e = true; 
		
		d = 0; 
		
		while(e) {
			
			System.out.printf("Digite um número para o X: ");
			a = ler.nextInt(); 
			
			System.out.printf("Digite um número para o Y: ");
			b = ler.nextInt();
			
			if(a <= 0 || b <= 0) {
				
				break;
				
			} else {
				
				d = 0; 
				
				if(a < b) {
					
					for(c = a; c <= b; c++) {
						
						System.out.printf("%d", c); 
						d += c;
					}
					
					System.out.printf(" Soma = %d \n", d); 
					
				} else if (a > b) {
					
					for(c = b; c <= a; c++) {
						
						System.out.printf("%d", c); 
						d+=c;
					}
					
					System.out.printf(" Soma = %d \n", d);
				}
			}
		}
	}
}
