public class App {
    public static void main(String[] args) throws Exception {
        MeioDeTransporte Transpo = new MeioDeTransporte();

        
        System.out.println("\n");
        System.out.println("Id: " + Transpo.getId()  );
        System.out.println("Modelo: " + Transpo.getModelo());
        System.out.println("Ano: " + Transpo.getAno());
        System.out.println("Consumo : " + Transpo.consumo() );
    }
}
