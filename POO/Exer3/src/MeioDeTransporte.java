import java.util.Random;

public class MeioDeTransporte {
    private int id;
    private short ano;
    private String modelo;
    private double carga_maxima;

    
    public MeioDeTransporte(){
        Random rand = new Random();
        id = rand.nextInt(50);
        ano = 2022;
        modelo = "Honda Civic";
        carga_maxima = 420.00;
    }

    public double consumo(){
        Terrestre terre = new Terrestre();
        double potencia = terre.getPotencia();

        double consumoCalc = potencia * carga_maxima * 100;
        
        return consumoCalc;
    };

    public int getId() {
        return id;
    }

    public short getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCarga_maxima() {
        return carga_maxima;
    }
}
