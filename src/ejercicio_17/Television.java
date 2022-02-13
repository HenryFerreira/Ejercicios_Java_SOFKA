package ejercicio_17;

public class Television extends Electrodomestico {
    //Atributos
    private float resolucion;
    private boolean sintonizadoTDT;

    Television(){//Constructor por defecto
        this.resolucion = 20;
        this.sintonizadoTDT = false;
    }

    public Television(float precioBase, float peso) {
        super(precioBase, peso);
    }

    public Television(float precioBase, String color, char consumoEnergetico, float peso, float resolucion, boolean sintonizadoTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadoTDT = sintonizadoTDT;
    }

    public float precioFinal(){
        float precioBase = super.precioFinal();

        if(this.resolucion > 40){
            float extra = (getPrecioBase() * 0.30F);
            precioBase += extra;
        }
        if(sintonizadoTDT){
            precioBase += 50;
        }
        return precioBase;
    }


    public float getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadoTDT() {
        return sintonizadoTDT;
    }
}
