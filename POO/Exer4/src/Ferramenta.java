import java.util.Random;

public class Ferramenta {
    
    private String categoria;
    private int serial;

    public Ferramenta(){
        Random rand = new Random();
        serial = rand.nextInt(500000);
    };


    public void setSerial(int serial) {
        this.serial = serial;
    };

    public int getIdentificador() {
        return serial;
    };

    public void separar(String categoria) {
        if (categoria.length() > 0) {
            this.categoria = categoria;
            System.out.println(this.categoria);
        }else{
            this.categoria = "Outros";
            System.out.println(this.categoria);
        }
        
    }; 
}
