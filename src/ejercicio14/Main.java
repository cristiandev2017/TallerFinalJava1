package ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Por favor ingrese un número");
        numero = sc.nextInt();

      while (numero<=1000){
          System.out.println(numero);
          numero = numero+2;
      }
    }
}
