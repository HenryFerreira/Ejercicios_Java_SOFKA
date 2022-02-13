package ejercicios_1_al_14;

import java.util.Scanner;

public class opcionesDelMenu {
    static Scanner scanner = new Scanner(System.in);

    public void menuDeOpciones() {
        int opcMenu;

        do {
            System.out.println("|BIENVENIDO AL MENÚ PRINCIPAL|\n");

            System.out.println("1 - Ejericio 1 y 2 - Comparar valores");
            System.out.println("2 - Ejercicio 3 - Área del Circulo");
            System.out.println("3 - Ejercicio 4 - Calcular precio con IVA");
            System.out.println("4 - Ejercicio 5 y 6 - Mostrar números Pares e Impares");
            System.out.println("5 - Ejercicio 7 - Pedir números mayores a cero");
            System.out.println("6 - Ejercicio 8 - Días de la semana");
            System.out.println("7 - Ejericio 9 y 10 - Cambiar frase");
            System.out.println("8 - Ejercicio 11 - Contar vocales");
            System.out.println("9 - Ejercicio 12 - Comparar palabras");
            System.out.println("10 - Ejercicio 13 - Hora y Fecha actual");
            System.out.println("11 - Ejercicio 14 - Pedir un número y avanzar hasta el mil");
            System.out.println("0 - Salir");


            System.out.println("\nDigite una de las opciones: ");
            opcMenu = scanner.nextInt();
            logicaDelMenu(opcMenu);
        } while (opcMenu != 0);
    }

    public void logicaDelMenu(int opcMenu) {
        switch (opcMenu) {
            case 1: {
                comprobarValores cv = new comprobarValores();
                cv.iniciar();
                break;
            }
            case 2: {
                calcularAreas ca = new calcularAreas();
                ca.iniciar();
                break;
            }
            case 3: {
                calcularPresio cp = new calcularPresio();
                cp.iniciar();
                break;
            }
            case 4: {
                mostrarNumeros mn = new mostrarNumeros();
                mn.iniciar();
                break;
            }
            case 5: {
                pedirNumero pn = new pedirNumero();
                pn.iniciarMayorACero();
                break;
            }
            case 6: {
                diasLaborales dl = new diasLaborales();
                dl.iniciar();
                break;
            }
            case 7: {
                remplazarTexto rt = new remplazarTexto();
                rt.iniciar();
                break;
            }
            case 8: {
                vocales v = new vocales();
                v.iniciar();
                break;
            }
            case 9: {
                compararTextos ct = new compararTextos();
                ct.iniciar();
                break;
            }
            case 10: {
                consultarFecha cf = new consultarFecha();
                cf.iniciar();
                break;
            }
            case 11: {
                pedirNumero pn = new pedirNumero();
                pn.iniciarHastaMil();
                break;
            }
            case 0: {
                break;
            }
            default: {
                System.out.println("OPCION INVALIDA, VUELVA A INTENTAR");
                break;
            }
        }
    }
}
