package ejercicio17;

import java.util.Locale;

public class Electrodomestico {
    //Variables
    private String color = COLOR;
    private double precio=100;
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
        this.precio = precio;
        this.peso = peso;
    }

    //Constructor con todos los argumentos
    public Electrodomestico(double precio, double peso, String color, char consumo){
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio_base) {
        this.precio = precio;
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

    private boolean comprobarConsumoEnergetico(char letra){
        boolean valida = false;
        for (int i = 0; i < letras.length ; i++) {
            if(letra == letras[i]){
                this.consumo = letras[i];
                valida=true;
                break;
            }else{
                this.consumo =CONSUMO;
                valida = false;
            }
        }
        return valida;
    }

    public void calcularConsumo(){
        boolean valida_c = comprobarConsumoEnergetico(getConsumo());
        if (valida_c == true){
            switch (consumo){
                case 'A':
                    precio = precio +100;
                    break;
                case 'B':
                    precio = precio +80;
                    break;
                case 'C':
                    precio = precio +60;
                    break;
                case 'D':
                    precio = precio+50;
                    break;
                case 'E':
                    precio = precio+30;
                    break;
                default:
                    precio =precio+10;
            }
        }else{
            System.out.println("No ha ingresado un consumo valido");
        }
        System.out.println("Precio : "+precio);
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

    public void calcularTamanio(){
        if(peso<20){
            precio = precio +10;
        }else if(peso<50){
            precio = precio +50;
        }else if(peso<80) {
            precio = precio + 80;
        }else{
            precio = precio + 100;
        }
    }

    public void precioBase(){
        calcularConsumo();
        calcularTamanio();
    }

    protected void sumarAdicional( double adicional){
        precio = precio + adicional;
    }

    public double precioFinal(){
        precioBase();
        return precio;
    }


}
