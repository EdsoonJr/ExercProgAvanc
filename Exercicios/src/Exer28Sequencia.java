public class Exer28Sequencia {
    public static void main(String[] args) {
		int i=1, j=60;
		while (j >= 0) {
			for (int k = 0; k < 1; k++) {
				System.out.println("I=" + i + " J=" + j);
				i++;
			}
			j-=5;
			i+=2;
		}
	}
}
