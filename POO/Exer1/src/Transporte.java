import java.util.Random;

public class Transporte {

    private int id;
    private int ano;
    private String modelo;
    private double carga_maxima;
    private double potencia;

    public Transporte() {
        Random rand = new Random();
        id = rand.nextInt(50);
        
    };

    public double consumo() {
        double consumoCalc = potencia * carga_maxima * 100;
        return consumoCalc;
    };

    public void gravaModelo(String modelo) {
        this.modelo = modelo;
    }

    public String leiaModelo() {
        return modelo;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    

}
