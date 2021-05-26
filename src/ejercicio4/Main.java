package ejercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iva iva = new Iva();

        System.out.println("Ingrese el valor del producto");
        iva.setValor(sc.nextDouble());

        System.out.println("El valor del producto sin iva es: "+iva.getValor());
        System.out.println("El valor del producto con iba es: "+iva.calcularPrecioIva());
    }

}
