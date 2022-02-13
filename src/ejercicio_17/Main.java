package ejercicio_17;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = {
                new Lavadora(1500,"azul",'A',100,12),
                new Lavadora(1200,59),
                new Television(180,"negra",'A',2,29,true),
                new Lavadora(),
                new Television(),
                new Television(890,5),
                new Television(),
                new Lavadora(),
                new Television(),
                new Lavadora()
        };

        for(int i =0; i< electrodomesticos.length;i++){
            System.out.println("[" + electrodomesticos[i].precioFinal() + "]");
        }

    }
}
