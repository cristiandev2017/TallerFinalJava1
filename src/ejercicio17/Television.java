package ejercicio17;

public class Television extends Electrodomestico {

    private double resolucion;
    private boolean sintonizador = false;
    double recargo;
    //Constructor por defecto
    public Television(){

    }
    //Constructor con el precio y peso
    public Television(double precio, double peso, String color,char consumo) {
    super(precio,peso,color,consumo);
    }

    //Constructor con resolucion,sintoniza y demas atributos
    public Television(double precio, double peso, double resolucion, boolean sintonizador) {
        super(precio,peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador(boolean b) {
        return sintonizador;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    //Logica para recalculo para Tv
    public void obtenerPrecioPulgadas(){
        if (resolucion > 40){
            recargo = getPrecio() * 0.3;
            sumarAdicional(recargo);
        }
    }

    public void obtenerPrecioSintonizador(){
        System.out.println("Estoy entrando a esta funcion de sintoniza"+sintonizador);
        if (sintonizador == true){
            sumarAdicional(50);
        }
    }

    public double precioFinal(){
        super.precioFinal();
        obtenerPrecioPulgadas();
        obtenerPrecioSintonizador();
        return getPrecio();
    }



}
