package ejercicios_1_al_14;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class compararTextos {
    static Scanner scanner = new Scanner(System.in);

    public void verificarIgualdadDeStrings(String tex_1, String tex_2) {
        if (tex_1.equals(tex_2)) {
            System.out.println("Las palabras son IGUALES: [" + tex_1 + "]");
        } else {
            System.out.println("Las palabras son DIFERENTES: [" + tex_1 + "] != [" + tex_2 + "]");
        }
    }

    public void iniciar() {
        String tex_1, tex_2;
        System.out.println("|Bienvenido al Programa - Comparar Palabras|");
        System.out.print("Digite la primera palabra: ");
        tex_1 = scanner.nextLine();

        System.out.print("\nDigite la segunda palabra: ");
        tex_2 = scanner.nextLine();

        verificarIgualdadDeStrings(tex_1, tex_2);
    }
}
