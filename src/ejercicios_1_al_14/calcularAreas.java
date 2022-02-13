package ejercicios_1_al_14;

import java.util.Scanner;

public class calcularAreas {
    static Scanner scanner = new Scanner(System.in);
    public static void areaDelCirculo(int radio){
       double resultado;
       resultado = Math.PI * (Math.pow(radio,2));

        System.out.println("El area del Circulo con radio " + radio +" es de: [" + resultado +"]");
    }

    public void iniciar() {
        int radio;
        System.out.println("|Bienvenido al Programa|\n");
        System.out.println("Ingrese el Radio del circulo: ");
        radio = scanner.nextInt();
        areaDelCirculo(radio);
    }
}
