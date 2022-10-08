public class Exer29Sequecia2 {
    
    public static void main(String[] args) {
        int i=1, j=7;
		while ((i <= 9) && (j <= 7)) {
			for (int k = 0; k < 3; k++) {
				System.out.println("I=" + i + " J=" + j);

				j--;
			}
			j+=3;
			i+=2;
		}
    }
    
}
