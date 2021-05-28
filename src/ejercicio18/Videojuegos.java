package ejercicio18;

public class Videojuegos implements Entregable{
    private static final int HORAS = 10;
    private static final boolean ENTREGADO = false;
    private String titulo;
    private int horas = HORAS;
    private boolean entregado = ENTREGADO;
    private String genero;
    private String company;

    //Constructor por defecto
    public Videojuegos() {

    }

    //Constructor con titulo y horas
    public Videojuegos(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
    }

    public Videojuegos(String titulo, int horas, String genero, String company) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.company = company;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Videojuegos{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public void entregar(){
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }
}
