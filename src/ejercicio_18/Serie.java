package ejercicio_18;

public class Serie implements Entregable {
    private String titulo = "";
    private int numeroDeTemporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    Serie(){}//Constructor por Defecto

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString(){
        return "\n[Titulo: " + this.titulo + "]" +
                "\n[Número de temporadas: " + this.numeroDeTemporadas + "]" +
                "\n[Entregado?: " + this.entregado + "]" +
                "\n[Género: " + this.genero + "]" +
                "\n[Creador: " + this.creador + "]";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        if(a instanceof Serie){
            Serie aComparar = (Serie) a;
            if(this.numeroDeTemporadas == ( aComparar.numeroDeTemporadas)){
                return true;
            }
        }
        return false;
    }
}
