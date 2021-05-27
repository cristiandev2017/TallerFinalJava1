package ejercicio12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        String word1;
        String word2;
        int leng1;
        int leng2;

        System.out.println("Por favor ingrese la primera palabra");
        word1 = sc.next();
        System.out.println("Por favor ingrese la segunda palabra");
        word2 = sc.next();

        leng1 = word1.length();
        leng2 = word2.length();

        if (leng1 == leng2){
            System.out.println("Comparaciones: ");
            System.out.println(word1 + " | " + word2);
            for (int i = 0; i < word1.length() ; i++) {
                  System.out.println(word1.charAt(i) + "      " + word2.charAt(i));
                if(word1.charAt(i) != word2.charAt(i) ){
                    System.out.println("En esta tiene diferencia");
                }
            }
        }else{
            System.out.println("Las palabras no son iguales");
        }
    }
}
