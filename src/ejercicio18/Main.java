package ejercicio18;

public class Main {

    public static void main(String[] args) {
        Serie[] series = new Serie[5];

        series[0] = new Serie("Lol", 11,"Rol", "Anton");
        series[1] = new Serie("Escorpion", 8,"Drama", "Pepe");
        series[2] = new Serie("Pedro", 9,"Accion", "sancho");
        series[3] = new Serie("Pan", 11,"Drama", "Paco");
        series[4] = new Serie("Paquito", 14,"Rol", "Anton");

        series[0].entregar();
        System.out.println(series[0].isEntregado());
    }
}
