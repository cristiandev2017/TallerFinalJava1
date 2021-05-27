package ejercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        persona.setAltura(1.76);
        persona.setPeso(70);
        persona.setEdad(17);
        persona.mensajePeso();
        persona.mensajeEdad();
        persona1.comprobarSexo(persona1.getSexo());
        System.out.println(persona1.getSexo());
        persona1.generarDNI();
        */
        getpersona1(sc);

    }

    private static void getpersona1(Scanner sc) {

        String nombrep1,sexop1;
        int edadp1;
        double pesop1,alturap1;
        char sexoch;
        System.out.println("*******************************");
        System.out.println("* Ingresa los datos*");
        System.out.println("Por favor ingrese el nombre");
        nombrep1 = sc.nextLine();
        System.out.println("Por favor ingrese su sexo");
        sexop1 = sc.next();
        sexoch = sexop1.charAt(0);
        System.out.println("Por favor ingrese la edad");
        edadp1 = sc.nextInt();
        System.out.println("Por favor ingrese el peso");
        pesop1 = sc.nextDouble();
        System.out.println("Por favor ingrese la altura");
        alturap1 = sc.nextDouble();
        System.out.println("* RESULTADO PRIMERA INSTANCIA*");
        Persona persona = new Persona(nombrep1,edadp1,sexoch,pesop1,alturap1);
        System.out.println("Hola "+persona.getNombre());
        persona.mensajePeso();
        persona.mensajeEdad();
        System.out.println(persona);
    }

    private static void getpersona2(Scanner sc) {
        String nombrep2,sexop2;
        int edadp2;
        char sexoch2;
        System.out.println("*******************************");
        System.out.println("* Ingresa los datos*");
        System.out.println("Por favor ingrese el nombre");
        nombrep2 = sc.nextLine();
        System.out.println("Por favor ingrese su sexo");
        sexop2 = sc.next();
        sexoch2 = sexop2.charAt(0);
        System.out.println("Por favor ingrese la edad");
        edadp2 = sc.nextInt();
        System.out.println("* RESULTADO PRIMERA INSTANCIA*");
        Persona persona2 = new Persona(nombrep2,edadp2,sexoch2);
        System.out.println("Hola "+persona2.getNombre());
        persona2.mensajePeso();
        persona2.mensajeEdad();
        System.out.println(persona2);
    }

    private static void getpersona3(Scanner sc) {
        Persona persona3 = new Persona();
        System.out.println("*******************************");
        System.out.println("* Ingresa los datos*");
        System.out.println("Por favor ingrese el nombre");
        persona3.setNombre((sc.nextLine()));
        System.out.println("Por favor ingrese la edad");
        persona3.setEdad((sc.nextInt()));
        System.out.println("Por favor ingrese el peso");
        persona3.setPeso(sc.nextDouble());
        System.out.println("Por favor ingrese la altura");
        persona3.setAltura(sc.nextDouble());
        System.out.println("* RESULTADO PRIMERA INSTANCIA*");
        System.out.println("Hola "+persona3.getNombre());
        persona3.mensajePeso();
        persona3.mensajeEdad();
        System.out.println(persona3);
    }
}
