package ejercicio17;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        double preciotelevision=0,precioLavadoras=0,precioElectrodomesticos=0;

        //Electrodomestico electro = new Electrodomestico();
        ArrayList<Electrodomestico> electrodomestico = new ArrayList<>(10);
        electrodomestico.add(new Electrodomestico(100, 10, "verde",'A'));
        electrodomestico.add(new Lavadora(50,10,"blanco",'A'));
        electrodomestico.add(new Television(50,10,"blanco",'C'));
        electrodomestico.add(new Electrodomestico(60,10,"blanco",'B'));
        electrodomestico.add(new Lavadora(80,10,"blanco",'A'));
        electrodomestico.add(new Television(50,10,"blanco",'A'));
        electrodomestico.add(new Lavadora(50,10,100));
        electrodomestico.add(new Lavadora(70,10,60));
        electrodomestico.add(new Lavadora(90,10,80));
        electrodomestico.add(new Television(100, 60, 40, true));

        for (int i = 0; i < electrodomestico.size(); i++) {
            if (electrodomestico.get(i) instanceof Television){
                preciotelevision =preciotelevision+ electrodomestico.get(i).precioFinal();
            }else if (electrodomestico.get(i) instanceof Lavadora){
                precioLavadoras = precioLavadoras+electrodomestico.get(i).precioFinal();
            }else if (electrodomestico.get(i) instanceof Electrodomestico) {
                precioElectrodomesticos =precioElectrodomesticos+ electrodomestico.get(i).precioFinal();
            }
            System.out.println(precioLavadoras);
        }
    }
}
