import java.util.Scanner;

public class vocales {
    static Scanner scanner = new Scanner(System.in);

    public static void contarVocales(String texto){
        int cantCaracteres = texto.length();
        int cant_A = 0, cant_E = 0, cant_I = 0, cant_O = 0, cant_U = 0;

        for(int i = 0; i < texto.length(); i++){
            if(texto.toLowerCase().charAt(i) == 'a'){
                cant_A++;
            } else if(texto.toLowerCase().charAt(i) == 'e'){
                cant_E++;
            } else if(texto.toLowerCase().charAt(i) == 'i'){
                cant_I++;
            } else if(texto.toLowerCase().charAt(i) == 'o'){
                cant_O++;
            } else if(texto.toLowerCase().charAt(i) == 'u'){
                cant_U++;
            }
        }

        System.out.println("Longitud de la frase ingresada: [" + cantCaracteres + "]");
        System.out.println("cantidad de A en la frase: [" + cant_A + "]");
        System.out.println("cantidad de I en la frase: [" + cant_I + "]");
        System.out.println("cantidad de U en la frase: [" + cant_U + "]");
        System.out.println("cantidad de E en la frase: [" + cant_E + "]");
        System.out.println("cantidad de O en la frase: [" + cant_O + "]");
    }

    public static void main(String[] args) {
        String texto;
        System.out.println("|Bienvenido al Programa - Vocales|");
        System.out.println("Ingrese una frase: ");
        texto = scanner.nextLine();
        contarVocales(texto);
    }

}
