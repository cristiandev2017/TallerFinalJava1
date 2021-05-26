package ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero 1:");
        number1 = sc.nextInt();
        System.out.println("Por favor ingrese el numero 2: ");
        number2 = sc.nextInt();

        if(number1>number2){
            System.out.println("numero1: "+number1+" es mayor a numero2:"+number2);
        }else if(number2>number1){
            System.out.println("numero2: "+number2+ "es mayor a numero1:"+number1);
        }else{
            System.out.println("Los numeros son iguales");
        }
    }
}
