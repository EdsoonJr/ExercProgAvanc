public class App {
    public static void main(String[] args) throws Exception {
        Produto prod = new Produto();

        System.out.println("Id: " + prod.getCod());
        System.out.println("Produto: " + prod.getNome());
        System.out.println("Descrição: " + prod.getDescricao());
        System.out.println("Validade: " + prod.getValidade());
        
    }
}
