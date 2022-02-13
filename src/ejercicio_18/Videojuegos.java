package ejercicio_18;

public class Videojuegos implements Entregable{
    //Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compannia = "";

    Videojuegos(){}//Constructor por Defecto

    public Videojuegos(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuegos(String titulo, int horasEstimadas, String genero, String compannia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compannia = compannia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompannia() {
        return compannia;
    }

    public void setCompannia(String compannia) {
        this.compannia = compannia;
    }

    @Override
    public String toString(){
        return "\n[Titulo: " + this.titulo + "]" +
                "\n[Horas estimadas: " + this.horasEstimadas + "]" +
                "\n[Entregado?: " + this.entregado + "]" +
                "\n[Género: " + this.genero + "]" +
                "\n[Compañia: " + this.compannia + "]";
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
        if(a instanceof Videojuegos){
            Videojuegos aComparar = (Videojuegos) a;
            if(this.horasEstimadas == ( aComparar.horasEstimadas)){
                return true;
            }
        }
        return false;
    }
}
