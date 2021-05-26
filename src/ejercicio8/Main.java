package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        System.out.println("Por favor ingrese un dia de la semana");
        dia = sc.next();
        dia = dia.toLowerCase();

        switch (dia){
            case "lunes":
                System.out.println("Dia Laboral");
                break;
            case "martes":
                System.out.println("Dia Laboral");
                break;
            case "miercoles":
                System.out.println("Dia Laboral");
                break;
            case "jueves":
                System.out.println("Dia Laboral");
                break;
            case "viernes":
                System.out.println("Dia Laboral");
                break;
            case "sabado":
                System.out.println("Dia no Laboral");
                break;
            case "domingo":
                System.out.println("Dia no Laboral");
                break;
            default:
                System.out.println("No ingreso un dia de la semana");

        }
    }
}
