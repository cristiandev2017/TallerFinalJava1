package ejercicio17;

public class Main {

    public static void main(String[] args) {
        Electrodomestico electro = new Electrodomestico();
        /*
        electro.setPrecio(0);
        electro.setConsumo('A');
        electro.setPeso(10);
        electro.precioBase();
         */

        Television tv = new Television();
        tv.setConsumo('A');
        tv.setPeso(10);
        tv.setSintonizador(true);
        tv.setResolucion(45);
        tv.precioFinal();
        System.out.println(tv.getPrecio());

    }
}
