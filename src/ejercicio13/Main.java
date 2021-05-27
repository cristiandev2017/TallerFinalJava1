package ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        //Se le da formato a la fecha
        DateTimeFormatter fecha_act = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
        System.out.println("Fecha actual en formato AAAA/MM/DD HH:MM:SS");
        System.out.println(fecha_act.format(LocalDateTime.now()));
    }
}
