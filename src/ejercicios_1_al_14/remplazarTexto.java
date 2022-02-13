package ejercicios_1_al_14;

import java.util.Scanner;

public class remplazarTexto {
    static Scanner scanner = new Scanner(System.in);

    public void remplazarCaracter(String extra) {//Remplaza el caracter "a" por el caracter "e"
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        texto = texto.replace("a", "e");
        extra = extra.replace("e", "a");

        System.out.println(texto + " " + extra);
    }

    public void quitarEspacios(String texto) {//Quita los espacios del string
        texto = texto.replace(" ", "");
        System.out.println(texto);
    }

    public void iniciar() {
        String extra;
        System.out.println("|Bienvenido al Programa - Cambiar Frase|");
        System.out.println("Digite algun comentario: ");
        extra = scanner.nextLine();

        remplazarCaracter(extra);
        quitarEspacios(extra);
    }

}
