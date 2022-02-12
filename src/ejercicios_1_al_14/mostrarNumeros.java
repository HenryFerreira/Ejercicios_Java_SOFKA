package ejercicios_1_al_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mostrarNumeros {
    public static void numerosParesImparesWhile(){
        int[] pares = new int[50];//Guarda los números PARES
        int[] impares = new int[50];//Guarda los números IMPARES
        int i = 1, index_par = 0, index_impar = 0;//Contadores para los indices

        while (i <= 100){//Mientras i sea menor o igual a 100
            if(i%2 == 0){//Si es un PAR

                pares[index_par] = i;//Se guarda en el arreglo
                index_par++;//Aumenta el contador de PARES

            } else {//Si es un IMPAR

                impares[index_impar] = i;//Se guarda en el arreglo
                index_impar++;//Aumenta el contador de IMPARES

            }
            i++;//Aumenta el valor de i
        }

        //--------------------------------------------//
        //PARES
        System.out.println("Números PARES: ");
        i = 0;//Se reinicia i
        while (i < pares.length){//Mientras sea menor que la cantidad de PARES
            System.out.print("[" + pares[i] + "]");//Imprime en consola el valor de esa posicion
            i++;
        }
        //--------------------------------------------//

        //--------------------------------------------//
        //IMPARES
        System.out.println("\nNúmeros IMPARES:");
        i = 0;//Se reinicia i
        while (i < impares.length){//Mientras sea menor que la cantidad de IMPARES
            System.out.print("[" + impares[i] + "]");//Imprime en consola el valor de esa posicion
            i++;
        }
        //--------------------------------------------//
    }

    public static void numerosParesImparesFor(){
        List<Integer> pares = new ArrayList<>();//Guarda los nímeros PARES
        List<Integer> impares = new ArrayList<>();//Guarda los números IMPARES

        for(int i = 1; i<=100; i++){//Mientras i sea menor o igual a 100
            if(i % 2 == 0){//Si es un PAR

                pares.add(i);//Agrega el número a la lista

            } else {//Si es un IMPAR

                impares.add(i);//Agrega el número a la lista

            }
        }

        //-------------------------------------------//
        //PARES
        System.out.println("\nNúmeros PARES:");
        for(int elemento : pares){//Recorre la lista de PARES
            System.out.print("[" + elemento + "]");//Imprime en consola el valor de esa posicion
        }
        //-------------------------------------------//

        //-------------------------------------------//
        System.out.println("\nNúmeros IMPARES:");
        for(int elemento : impares){//Recorre la lista de IMPARES
            System.out.print("[" + elemento + "]");//Imprime en consola el valor de esa posicion
        }
        //-------------------------------------------//
    }


    public static void main(String[] args) {
        System.out.println("|Buenvenido al Programa - Numeros PARES e IMPARES del 1 al 100|");
        numerosParesImparesWhile();
        numerosParesImparesFor();
    }
}
