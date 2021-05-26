package ejercicio10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;

        System.out.println("Ingrese una frase");
        phrase = sc.nextLine();

        phrase = phrase.replaceAll(" ", "");
        System.out.println(phrase);

    }
}
