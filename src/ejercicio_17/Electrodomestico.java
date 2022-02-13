package ejercicio_17;

public class Electrodomestico {
    //Atributos
    private float precioBase;
    private String color;
    private char consumoEnergetico;
    private float peso;

    public Electrodomestico() {//Constructor por defecto
        this.precioBase = 100;
        this.color = "Blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        boolean flag = false;
        char[] valores = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < valores.length; i++) {
            if (letra == valores[i]) {
                flag = true;
            }
        }
        if (!flag) {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color) {
        boolean flag = false;
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (int i = 0; i < colores.length; i++) {
            if (color.compareToIgnoreCase(colores[i]) == 0) {
                flag = true;
            }
        }
        if (!flag) {
            this.color = "blanco";
        }
    }

    public float precioFinal() {
        if (this.consumoEnergetico == 'A') {
            this.precioBase += 100;
        } else if (this.consumoEnergetico == 'B') {
            this.precioBase += 80;
        } else if (this.consumoEnergetico == 'C') {
            this.precioBase += 60;
        } else if (this.consumoEnergetico == 'D') {
            this.precioBase += 50;
        } else if (this.consumoEnergetico == 'E') {
            this.precioBase += 30;
        } else if (this.consumoEnergetico == 'F') {
            this.precioBase += 10;
        }

        if (this.peso == 0 || this.peso <= 19) {
            this.precioBase += 10;
        } else if (this.peso == 20 || this.peso <= 49) {
            this.precioBase += 50;
        } else if (this.peso == 50 || this.peso <= 79) {
            this.precioBase += 80;
        } else if (this.peso >= 80) {
            this.precioBase += 1000;
        }

        return this.precioBase;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }
}
