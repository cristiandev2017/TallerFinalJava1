package Ejercicio3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area();

        System.out.println("Ingrese el valor del radio");
        area.setRad(Double.parseDouble((sc.next())));

        System.out.println("El area del circulo es:"+area.calcularArea());
    }
}
