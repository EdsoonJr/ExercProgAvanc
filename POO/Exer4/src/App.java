public class App {
    public static void main(String[] args) throws Exception {
        
        ItemDeLoja itemLoja = new ItemDeLoja();
        Ferramenta ferr = new Ferramenta();
        Alimento alime = new Alimento();

        itemLoja.ExibirDados();
        System.out.println("\n");
        System.out.println("Ferramenta Serial: " + ferr.getIdentificador());
        System.out.print("Ferramenta Categoria: ");
        ferr.separar("");
        System.out.println("\n");
        System.out.println("Alimento Selo: " + alime.getIdentificador());
        
        
    }
}
