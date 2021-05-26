package ejercicio9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "La sonrisa sera la mejor arma contra la tristeza";
        String textuser="";
        Scanner sc = new Scanner(System.in);

        text = text.replaceAll("a","e");
        System.out.println("Por favor ingrese una frase");
        textuser = sc.nextLine();

        System.out.println(text + " "+textuser );
    }
}
