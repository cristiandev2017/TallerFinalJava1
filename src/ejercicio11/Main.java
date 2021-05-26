package ejercicio11;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String phrase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase");
        phrase = sc.nextLine();
        //Crearemos e inicializaremos un mapa (El primero sera la vocal y el otro la cantidad)
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",0);
        hashMap.put("e",0);
        hashMap.put("i",0);
        hashMap.put("o",0);
        hashMap.put("u",0);

        //Recorremos la cadena letra por letra y vemos si es o no vocal
        for (int i = 0; i < phrase.length(); i++) {
            char letraActual = phrase.charAt(i);
            if(esVocal(letraActual)){
                //La clave es la vocal pero en minuscula
                String clave = String.valueOf(letraActual).toLowerCase();
                //Ahora le sumamos a esa clave
                hashMap.put(clave,hashMap.get(clave)+1);
            }

        }
        //Ahora muestro los resultados
        System.out.printf("Resultado para '%s': \n",phrase);
        System.out.println("");
        for (Map.Entry<String,Integer> entry : hashMap.entrySet()){
            System.out.printf("Vocal: %s. Conteo: %d \n",entry.getKey(), entry.getValue());
        }

    }
    private static boolean esVocal(char caracter){
        return "aeiou".contains(String.valueOf(caracter).toLowerCase());
    }

}
