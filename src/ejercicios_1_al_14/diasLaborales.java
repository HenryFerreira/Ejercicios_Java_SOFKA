package ejercicios_1_al_14;

import java.util.Scanner;

public class diasLaborales {
    static Scanner scanner = new Scanner(System.in);

    public static void pedirDiaDeLaSemana(String dia) {
        switch (dia.toUpperCase()) {
            case "LUNES": {
                System.out.println("Ingreso el día LUNES este es un día LABORAL");
                break;
            }
            case "MARTES": {
                System.out.println("Ingreso el día MARTES este es un día LABORAL");
                break;
            }
            case "MIERCOLES": {
                System.out.println("Ingreso el día MIÉRCOLES este es un día LABORAL");
                break;
            }
            case "JUEVES": {
                System.out.println("Ingreso el día JUEVES este es un día LABORAL");
                break;
            }
            case "VIERNES": {
                System.out.println("Ingreso el día VIERNES este es un día LABORAL");
                break;
            }
            case "SABADO": {
                System.out.println("Ingreso el día SÁBADO este es un día NO LABORAL");
                break;
            }
            case "DOMINGO": {
                System.out.println("Ingreso el día DOMINGO este es un día NO LABORAL");
                break;
            }
            default: {
                System.out.println("El dato ingresado no es un día, vuelva a intentarlo");
            }
        }
    }

    public static void main(String[] args) {
        String dia;
        System.out.println("|Bienvenido al Programa - Día de la Semana|");
        System.out.println("Digite un día de la semana [Ejemplo: Lunes] :");
        dia = scanner.nextLine();
        pedirDiaDeLaSemana(dia);
    }
}
