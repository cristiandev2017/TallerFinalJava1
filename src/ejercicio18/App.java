package ejercicio18;

public class App {
    private static void completingSeries(Serie[] series){
        series[0] = new Serie("The Big Bang Theory", 12, "Comedia", "Chuck Lorre, Bill Prady");
        series[1] = new Serie("Game of Thrones", 8, "Drama", "Brian Kirk, D.B.Weiss");
        series[2] = new Serie("Smallville", 10, "Acción", "Jerry Siegel, Joe Shuster");
        series[3] = new Serie("Criminal minds", 15, "misterio","Jeff Davis");
        series[4] = new Serie("Hannibal", 3, "Drama", "Bryan Fuller");
    }
    private static void completingGames(Videojuegos[] videojuegos){
        videojuegos[0] = new Videojuegos("league of Legends", 60, "Fantasia", "Riot Games");
        videojuegos[1] = new Videojuegos("Age Of Empires II: DE", 21, "Estrategia", "Microsoft");
        videojuegos[2] = new Videojuegos("Warcraft III", 20, "Estrategia", "Blizzard");
        videojuegos[3] = new Videojuegos("World Of Warcraft", 100, "Fantasia", "Blizzard");
        videojuegos[4] = new Videojuegos("Call of Dutty",80,"Estrategia", "Infinity Ward,Treyarch");
    }

    private static void deliverSeries(Serie[] series){
        series[0].entregar();
        series[3].entregar();
        series[4].entregar();
    }

    private static void deliverJuegos(Videojuegos[] Videojuegos){
        Videojuegos[1].entregar();
        Videojuegos[4].entregar();
    }

    private static void contarSeriesEntregadas(Serie[] series){
        int numberSeries = 0;
        for(Serie serie : series){
            if(serie.isEntregado()){
                numberSeries++;
                serie.devolver();
            }
        }
        System.out.println("Hay " + numberSeries + " series entregadas");
    }

    private static void countSeriesDelivered(Videojuegos[] videojuegos){
        int numberGames = 0;

        for(Videojuegos game : videojuegos){
            if(game.isEntregado()){
                numberGames++;
                game.devolver();
            }
        }
        System.out.println("Hay " + numberGames + " videojuegos entregados");
    }

    private static void seriesAndSeason(Serie[] series){
        Serie seriesAndSeason = new Serie("temporal", 0, "temporal", "temporal");

        for(int i = 0; i < series.length; i++){
            if(series[i].compareTo(seriesAndSeason)){
                seriesAndSeason = series[i];
            }
        }
        System.out.println("La serie con mas horas estimadas es: ");
        System.out.println(seriesAndSeason);
    }

    private static void hoursGame(Videojuegos[] videojuegos){
        Videojuegos hoursGame = new Videojuegos("Temporal", 0);

        for(Videojuegos juego : videojuegos){
            if(juego.compareTo(hoursGame)){
                hoursGame = juego;
            }
        }
        System.out.println("El video juego con mas horas estimadas es: ");
        System.out.println(hoursGame);
    }

    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuegos[] videojuegos = new Videojuegos[5];

        completingSeries(series);
        completingGames(videojuegos);

        deliverSeries(series);
        deliverJuegos(videojuegos);

        System.out.println("------------------------");
        contarSeriesEntregadas(series);
        System.out.println("------------------------");
        countSeriesDelivered(videojuegos);

        System.out.println("------------------------");
        seriesAndSeason(series);
        System.out.println("------------------------");
        hoursGame(videojuegos);

    }

}