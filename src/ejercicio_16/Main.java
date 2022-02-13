package ejercicio_16;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        int edad;
        char sexo;
        float peso;
        float altura;
        System.out.println("|Bienvenido al Programa - Persona|\n");

        System.out.print("Digite su Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Digite su Edad: ");
        edad = scanner.nextInt();
        System.out.print("Digite su Sexo [H = Hombre | M = Mujer]: ");
        sexo = scanner.next().charAt(0);
        System.out.print("Digite su Peso: ");
        peso = scanner.nextFloat();
        System.out.println("Digite su Altura: ");
        altura = scanner.nextFloat();

        Persona persona_1 = new Persona(nombre, edad, sexo, peso, altura);
        persona_1.comprobarSexo();
        persona_1.generaDNI();

        if (persona_1.calcularIMC() == -1) {
            System.out.println("\nESTA EN SU PESO IDEAL");
        } else if (persona_1.calcularIMC() == 0) {
            System.out.println("\nESTA POR DEBAJO DE SU PERO IDEAL");
        } else if (persona_1.calcularIMC() == 1) {
            System.out.println("\nESTA CON SOBREPESO");
        }

        persona_1.esMayorDeEdad();
        System.out.println(persona_1.toString());


        Persona persona_2 = new Persona(nombre, edad, sexo, 0, 0);
        persona_2.comprobarSexo();
        persona_2.generaDNI();
        if (persona_2.calcularIMC() == -1) {
            System.out.println("\nESTA EN SU PESO IDEAL");
        } else if (persona_2.calcularIMC() == 0) {
            System.out.println("\nESTA POR DEBAJO DE SU PESO IDEAL");
        } else if (persona_2.calcularIMC() == 1) {
            System.out.println("\nESTA CON SOBREPESO");
        }
        persona_2.esMayorDeEdad();
        System.out.println(persona_2.toString());

        Persona persona_3 = new Persona();
        persona_3.comprobarSexo();
        persona_3.setNombre("Elizabrth");
        persona_3.setEdad(22);
        persona_3.setSexo('M');
        persona_3.setPeso(60.5F);
        persona_3.setAltura(1.70F);
        persona_3.generaDNI();
        if (persona_3.calcularIMC() == -1) {
            System.out.println("\nESTA EN SU PESO IDEAL");
        } else if (persona_3.calcularIMC() == 0) {
            System.out.println("\nESTA POR DEBAJO DE SU PERO IDEAL");
        } else if (persona_3.calcularIMC() == 1) {
            System.out.println("\nESTA CON SOBREPESO");
        }
        persona_3.esMayorDeEdad();
        System.out.println(persona_3.toString());
    }
}
