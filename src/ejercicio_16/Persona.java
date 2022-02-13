package ejercicio_16;

import java.util.Random;

public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private float peso;
    private float altura;

    public Persona(){//Constructor por Defecto
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        /* * calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)),
        * si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número
        * entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve un 0
        * y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1.
        * Te recomiendo que uses constantes para devolver estos valores.
        * */
        float imc = (float) (this.peso / (Math.pow(this.altura,2)));
        if(imc < 20){
            return -1;
        }else if(imc >= 20 && imc <=25){
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
        if(this.edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    public void comprobarSexo(){
        //comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto,
        //sera H. No será visible al exterior.
        if(this.sexo != 'H' || this.sexo != 'M'){
            setSexo('H');
        }
    }

    public String toString(){
        //toString(): devuelve toda la información del objeto.
        return "\n[Nombre: " + this.nombre + "]" +
                "\n[Edad: " + this.edad + "]" +
                "\n[DNI: " + this.DNI + "]" +
                "\n[Sexo: " + this.sexo + "]" +
                "\n[Peso: " + this.peso + "]" +
                "\n[Altura: " + this.altura + "]";
    }

    public String generaDNI(){
        int dni_num;
        long max = 99999999;
        long min = 10000000;
        String dni;
        char dni_char;
        Random random = new Random();

        dni_num = (int) (min+Math.random() * max);

        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni_num%23;
        dni_char = caracteres.charAt(resto);

        dni = Integer.toString(dni_num) + dni_char;

        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
