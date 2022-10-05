
import java.util.Date;
import java.util.Random;


public class Produto {
    
    private int id;
    private String nome;
    private String descricao;
    private Date validade;

    public Produto(){
        Random rand = new Random();
        id = rand.nextInt(50);
        nome = "Feijão Kicaldo";
        descricao = "Feijão preto tipo 1";
        Date data = new Date();
        validade = data;
    };

    public int getCod(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getValidade() {
        return validade;
    }

}
