import java.util.Scanner;

public class Exer33SomaIntervalo {
    public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in); 
		
		int N; 
		
		System.out.println("Informe um Número: "); 
		N = ler.nextInt(); 
        ler.close();
		
		for(int i = 0; i < N; i++) {
			
			System.out.println(i + " " + (i * i) + " " + (i * i * i)); 
		}
	}
}
