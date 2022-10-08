import java.util.Scanner;

public class Exer23ComparaNumeros {
    
    public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);
		
		int x; 
		int y; 
		
		System.out.println("Informe o valor de x: "); 
		x = ler.nextInt(); 
		System.out.println("Informe o valor de y: ");
		y = ler.nextInt(); 
		if(x > y) { 			
			System.out.println("Valor verdadeiro:  " + 1); 			
		} else {			
			System.out.println("Valor Falso: " + 0); 
		}	
		if(x == y) {	
			System.out.println("Valor Verdadeiro: " + 1); 			
		} else {			
			System.out.println("Valor Falso: " + 0);
		}		
		if(x < y) {			
			System.out.println("Valor Verdadeiro: " + 1);			
		} else {			
			System.out.println("Valor Falso: " + 0);
		} 
		if(x != y) {
			System.out.println("Valor Verdadeiro: " + 1);	
		} else {
			System.out.println("Valor Falso: " + 0);
		} 		
		if(x >= y) {
			System.out.println("Valor Verdadeiro: " + 1);			
		} else {			
			System.out.println("Valor Falso: " + 0);
		}		
		if(x <= y) {			
			System.out.println("Valor Verdadeiro: " + 1);			
		} else {		
			System.out.println("Valor Falso: " + 0);
		}
		ler.close();
	}
}
