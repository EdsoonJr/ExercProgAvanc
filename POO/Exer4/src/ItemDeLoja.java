import java.util.Random;

public class ItemDeLoja {
    
    private int codigoDoItem ;
    private String nomeDoItem;
    private String descricaoDoItem;
    private double valorDoItem;

    public ItemDeLoja(){
        Random rand = new Random();
        codigoDoItem = rand.nextInt(5000);
        nomeDoItem = "Vassoura";
        descricaoDoItem = "Para Limpar a Casa";
        valorDoItem = 13.15;
    };

    public void ExibirDados(){
        System.out.println("Codigo do Item: " + codigoDoItem);
        System.out.println("Nome do Item: " + nomeDoItem);
        System.out.println("Descrição do Item: " + descricaoDoItem);
        System.out.println("Valor do Item: " + valorDoItem);
    };

    public void setCodigoDoItem(int codigoDoItem) {
        this.codigoDoItem = codigoDoItem;
    }

    public int getIdentificador() {
        return codigoDoItem;
    };

    

}
