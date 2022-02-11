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

    public static void main(String[] args) {
        System.out.println("|Bienvenido al Programa - Pedir Numeros|");
        pedirNumeroMayorACero();
    }
}
