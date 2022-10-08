import java.util.Scanner;

public class Exer18InverteNum {
    public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
	
		int numero; 
		int aux = 0; 
		
		System.out.println("Informe um número: "); 
		numero = ler.nextInt(); 
        ler.close();
		
		while(numero > aux) {
			
			aux *= 10;
			aux += (numero % 10); 
			numero /= 10; 
			
		}
		
		System.out.println("Número invertido: " + aux);
	}
}
