package ejercicio_18;

public class Main {
    public static void main(String[] args) {
        Serie[] series = {
                new Serie("Juego de tronos", 8, "Fantasía Medieval","George R.R. Martin"),
                new Serie("Konosuba", "Natsume Akatsuki"),
                new Serie(),
                new Serie(),
                new Serie()
        };

        Videojuegos[] videojuegos = {
                new Videojuegos("Dark Souls",26),
                new Videojuegos("Dark Souls II", 36 ),
                new Videojuegos("Dark Souls III",30),
                new Videojuegos(),
                new Videojuegos()
        };

        series[0].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();

        int cantSeriesEntregadas = 0;
        int cantVideojuegosEntregados = 0;
        Videojuegos juego = new Videojuegos();
        Serie serie = new Serie();

        for(int i=0; i<series.length;i++){
            if(series[i].isEntregado()){
                cantSeriesEntregadas++;
            }
        }

        for(int i=0; i<videojuegos.length;i++){
            if(videojuegos[i].isEntregado()){
                cantVideojuegosEntregados++;
            }
        }

        for(int i=0; i<videojuegos.length;i++){
            if(juego.getHorasEstimadas() < videojuegos[i].getHorasEstimadas()){
                juego = videojuegos[i];
            }
        }

        for(int i=0; i<series.length;i++){
            if(serie.getNumeroDeTemporadas() < series[i].getNumeroDeTemporadas()){
                serie = series[i];
            }
        }

        System.out.println("[La serie con más temporadas es: " + serie.getTitulo() + "con " +
                serie.getNumeroDeTemporadas() + " temporadas]");

        System.out.println("[El videojuego con más horas estimadas es: " + juego.getTitulo() + " con " +
                juego.getHorasEstimadas() + " horas]");

        for(int i=0; i<videojuegos.length;i++){
            System.out.println(videojuegos[i].toString());
        }

        for(int i=0; i<series.length;i++){
            System.out.println(series[i].toString());
        }
    }
}
