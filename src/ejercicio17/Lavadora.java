package ejercicio17;

public class Lavadora  extends Electrodomestico{
    private double carga=5;

    //Constructor por defecto
    public Lavadora(){

    }

    //Constructor con precio y peso
    public Lavadora(double precio, double peso, String color,char consumo) {
        super(precio,peso,color,consumo);
    }

    //Constructor con resolucion,sintoniza y demas atributos
    public Lavadora(double precio, double peso, double carga) {
        super(precio,peso);
        this.carga = carga;
     }

    public void sumarCarga(){
       if (carga > 30){
            sumarAdicional(50);
        }
    }

    public double precioFinal(){
        super.precioFinal();
        sumarCarga();
        return getPrecio();
    }



}
