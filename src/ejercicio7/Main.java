package ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=-1;
        System.out.println("*****************************************");
        System.out.println("** Identificar mayor o igual(DO WHILE) **");
        System.out.println("*****************************************");
        System.out.println("**     Por favor ingrese un numero :   **");
        do {
          System.out.println("Por favor ingrese un numero mayor a 0");
          numero = sc.nextInt();
          System.out.println("Numero ingresado:"+numero);
        }while (numero<0);
    }
}
