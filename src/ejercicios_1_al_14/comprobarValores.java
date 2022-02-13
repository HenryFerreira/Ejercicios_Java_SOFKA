package ejercicios_1_al_14;

import java.util.Scanner;

public class comprobarValores {
    static Scanner scanner = new Scanner(System.in);

    public static void compararValores(int num1, int num2){
        if(num1 == num2){//Si los numeros so iguales
            System.out.println("Los números ingresados son iguales: [" + num1 + "] = [" + num2+ "]");
        } else if (num1 > num2){//Si el numero 1 es mayor
            System.out.println("El número "+ num1 +" es mayor que el número "+ num2 +": [" + num1 + "] > [" + num2+ "]");
        } else {//Si el numero 1 es menor
            System.out.println("El número "+ num1 +" es menor que el número "+ num2 +": [" + num1 + "] < [" + num2+ "]");
        }
    }

    public void iniciar() {
        int num1, num2;
        System.out.println("|Bienvenido al Programa|\n");
        System.out.println("Ingrese el primero número: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        compararValores(num1,num2);
    }
}
