import java.util.Scanner;

/* 12. Neste problema, você deverá ler 3 palavras que definem o tipo de animal
possível segundo o esquema abaixo, da esquerda para a direita. Em seguida
conclua qual dos animais seguintes foi escolhido, através das três palavras
fornecidas. */

public class Exer12Animais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a palavra 1");
        String palavra1 = ler.nextLine();
        System.out.println("Digite a palavra 2");
        String palavra2 = ler.nextLine();
        System.out.println("Digite a palavra 3");
        String palavra3 = ler.nextLine();
        ler.close();
        String animal = "";

        if (palavra1 .equalsIgnoreCase("vertebrado")) {
            if (palavra2.equalsIgnoreCase("ave")) {
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    animal = "águia";
                }else{
                    animal = "pomba";
                }
            }else if (palavra2.equalsIgnoreCase("mamifero")) {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    animal = "homem";
                }else{
                    animal = "vaca";
                }
            }
        }else if (palavra1.equalsIgnoreCase("invertebrado")) {
            if (palavra2.equalsIgnoreCase("inseto")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    animal = "pulga";
                }else{
                    animal = "largata";
                }
            }else if (palavra2.equalsIgnoreCase("anelideo")) {
                if (palavra3.equalsIgnoreCase("hematofago")) {
                    animal = "sanguessuga";
                }else{
                    animal = "minhoca";
                }
            }
        }

        System.out.println("\n" + animal);

    }
}
