import java.util.Random;

public class Alimento {
    
    private int selo;

    public Alimento() {
        Random rand = new Random();
        selo = rand.nextInt(50);
    };

    public int getIdentificador() {
        return selo;
    };
}
