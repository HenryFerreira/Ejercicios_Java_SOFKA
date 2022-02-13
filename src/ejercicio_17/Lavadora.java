package ejercicio_17;

public class Lavadora extends Electrodomestico {
    private float carga = 5;

    Lavadora() {
    }//Constructor por Defecto

    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
    }

    Lavadora(float carga) {
        this.carga = carga;
    }

    public Lavadora(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public float precioFinal() {
        float precioBase = super.precioFinal();

        if (this.carga >= 30) {
            precioBase += 50;
            this.modificarPrecio(precioBase);
        }
        return precioBase;
    }


    public float getCarga() {
        return carga;
    }
}
