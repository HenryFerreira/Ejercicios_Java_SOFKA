package ejercicios_1_al_14;

import java.util.Scanner;

public class calcularPresio {
    static Scanner scanner = new Scanner(System.in);

    public static void presioConIVA(float precio){
        float iva = 0.21F;
        float total = precio + (precio * iva);

        System.out.println("El precio del producto es de $" + total);
    }

    public static void main(String[] args) {
        float precio;
        System.out.println("|Bienvenido al Programa - Calcular Presio con IVA|\n");
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextFloat();
        presioConIVA(precio);
    }
}
