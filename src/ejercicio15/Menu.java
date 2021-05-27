package ejercicio15;

import java.util.Scanner;

public class Menu {

        public void Menu (){
            int in;
            Scanner sc = new Scanner(System.in);

            in = mostrarMenu(sc);

            while(in != 8){
                switch (in){
                    case 1:
                        System.out.println("Haz ingresado a la opcion de nuevo actor");
                        break;
                    case 2:
                        System.out.println("Haz ingresado a la opcion de buscar actor");
                        break;
                    case 3:
                        System.out.println("Haz ingresado a la opcion de eliminar actor");
                        break;
                    case 4:
                        System.out.println("Haz ingresado a la opcion de ver modificar de actor");
                        break;
                    case 5:
                        System.out.println("Haz ingresado a la opcion de ver todos los actores");
                        break;
                    case 6:
                        System.out.println("Haz ingresado a la opcion de buscar peliculas por actor");
                        break;
                    case 7:
                        System.out.println("Haz ingresado a la opcion de ver categoria de las peliculas de los actores");
                        break;
                    default:
                        System.out.println("Haz ingresado una opcion incorrecta");
                }
                in = mostrarMenu(sc);
            }
        }

    private int mostrarMenu(Scanner sc) {
        int in;
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                 GESTIÓN CINEMATOGRAFICA         +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+            1. NUEVO ACTOR                        +");
        System.out.println("+            2. BUSCAR ACTOR                       +");
        System.out.println("+            3. ELIMINAR ACTOR                     +");
        System.out.println("+            4. MODIFICAR ACTOR                    +");
        System.out.println("+            5. VER TODOS LOS ACTORES              +");
        System.out.println("+            6. VER PELICULAS DE LOS ACTORES       +");
        System.out.println("+ 7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES +");
        System.out.println("+                   8. SALIR                       +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        in = sc.nextInt();
        return in;
    }

}
