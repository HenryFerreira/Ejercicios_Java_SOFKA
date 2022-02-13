package ejercicios_1_al_14;

import java.util.Scanner;

public class pedirNumero {

    static Scanner scanner = new Scanner(System.in);

    public static void pedirNumeroMayorACero(){
        int num = 0;
        boolean flag = true;

        do{//Pedir números hasta que se ingrese uno mayor a cero
            System.out.println("Ingrese un número: ");
            num = scanner.nextInt();

            if(num < 0) {//Si es menor a cero cambia la bandera a flase
                flag = false;
            } else {//Si es mayor o igual a cero cambia la bandera a true
                flag = true;
            }

        }while(!flag);//Mientras la bandera sea diferente de false se ejecuta el doWhile
    }

    public static void pedirNumerosAvanzarHastaElMil(){
        int num;
        System.out.println("Ingrese un número: ");
        num = scanner.nextInt();

        System.out.println("Desde el [" + num + "] hasta el [1000]: ");
        for(; num <= 1000; num+=2){
            if(num%50 == 0){
                System.out.println();
            }
            System.out.print("["+ num +"]");
        }
    }

    public void iniciarMayorACero() {
        System.out.println("|Bienvenido al Programa - Pedir Numeros|");
        pedirNumeroMayorACero();
    }
    public void iniciarHastaMil() {
        System.out.println("|Bienvenido al Programa - Pedir Numeros|");
        pedirNumerosAvanzarHastaElMil();
    }
}
