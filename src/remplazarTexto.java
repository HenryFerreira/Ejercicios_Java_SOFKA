import java.util.Scanner;

public class remplazarTexto {
    static Scanner scanner = new Scanner(System.in);

    public static void remplazarCaracter(String extra) {//Remplaza el caracter "a" por el caracter "e"
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        texto = texto.replace("a", "e");
        extra = extra.replace("e", "a");

        System.out.println(texto + " " + extra);
    }

    public static void quitarEspacios(String texto) {//Quita los espacios del string
        texto = texto.replace(" ", "");
        System.out.println(texto );
    }

    public static void main(String[] args) {
        String extra;
        System.out.println("|Bienvenido al Programa - Cambiar Frase|");
        System.out.println("Digite algun comentario: ");
        extra = scanner.nextLine();

        remplazarCaracter(extra);
        quitarEspacios(extra);
    }

}
