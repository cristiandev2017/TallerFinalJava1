package ejercicio17;

import java.util.Locale;

public class Electrodomestico {
    //Variables
    private String color = COLOR;
    private double precio_base=100;
    private double peso = 5;
    private char consumo=CONSUMO;
    private static final char CONSUMO= 'F';
    private static final String COLOR= "blanco";
    private static final String colores[]= {"blanco","negro","rojo","azul","gris"};
    private static final char letras[]={'A','B','C','D','E','F'};
    //Constructor por defecto
    public Electrodomestico(){

    }

    //Constructor con precio y peso
    public Electrodomestico(double precio, double peso){
        this.precio_base = precio;
        this.peso = peso;
    }

    //Constructor con todos los argumentos
    public Electrodomestico(double precio, double peso,String color){
        this.precio_base = precio;
        this.peso = peso;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void comprobarConsumoEnergetico(char letra){
        for (int i = 0; i < letras.length ; i++) {
            if(letra == letras[i]){
                this.consumo = letras[i];
                break;
            }else{
                this.consumo =CONSUMO;
            }

        }
        System.out.println("CONSUMO"+this.consumo);

    }

    public void comprobarColor(String color){
        for (int i = 0; i < colores.length ; i++) {
            if(color.toLowerCase() == colores[i]){
                this.color = colores[i];
                break;
            }else{
                this.color =COLOR;
            }

        }
        System.out.println("COLOR"+this.color);

    }


}
