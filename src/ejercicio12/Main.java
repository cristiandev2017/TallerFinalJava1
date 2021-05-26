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
            for (int i = 0; i < word1.length() ; i++) {
                if(word1.charAt(i) != word2.charAt(i) ){
                    System.out.println("Tiene diferencia en la posicion "+i+" donde la letra la primera palabra es"+word1.charAt(i)+"y la letra en la segunda palabra es"+word2.charAt(i));
                }
            }
        }else{
            System.out.println("Las palabras son iguales");
        }
    }
}
