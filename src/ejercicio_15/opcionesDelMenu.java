package ejercicio_15;

import java.io.IOException;
import java.util.Scanner;

public class opcionesDelMenu {
    static Scanner scanner = new Scanner(System.in);

    public void menuDeOpciones() {
        int opcMenu;

        do {
            System.out.println("|BIENVENIDO AL MENÚ PRINCIPAL|\n");

            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

            System.out.println("\nDigite una de las opciones: ");
            opcMenu = scanner.nextInt();
            logicaDelMenu(opcMenu);
        } while (opcMenu != 8);
    }

    public void logicaDelMenu(int opcMenu) {
        switch (opcMenu) {
            case 1: {
                System.out.println("Eligió la opcion 1");
                break;
            }
            case 2: {
                System.out.println("Eligió la opcion 2");
                break;
            }
            case 3: {
                System.out.println("Eligió la opcion 3");
                break;
            }
            case 4: {
                System.out.println("Eligió la opcion 4");
                break;
            }
            case 5: {
                System.out.println("Eligió la opcion 5");
                break;
            }
            case 6: {
                System.out.println("Eligió la opcion 6");
                break;
            }
            case 7: {
                System.out.println("Eligió la opcion 7");
                break;
            }
            case 8: {
                System.out.println("Saliendo de programa");
                break;
            }
            default: {
                System.out.println("OPCION INVALIDA, VUELVA A INTENTAR");
                break;
            }
        }
    }
}
