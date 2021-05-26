package Ejercicio6;

import Ejercicio5.Operacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio5.Operacion op = new Operacion();

        System.out.println("*****************************************");
        System.out.println("**  impares y pares del 1 al 100 (FOR) **");
        System.out.println("*****************************************");

        op.operacion();
    }
}
