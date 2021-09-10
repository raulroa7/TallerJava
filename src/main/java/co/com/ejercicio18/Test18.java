package co.com.ejercicio18;

import javax.swing.*;

public class Test18 {
    private static void completingSeries(Serie[] series){
        series[0] = new Serie("La casa de papel", 4, "Comedia", "Alex Pina");
        series[1] = new Serie("Drive to survive", 3, "Deportes", "James Gay-Rees");
        series[2] = new Serie("Sex and the city", 10, "Drama", "Michael Patrick King");
        series[3] = new Serie("Vis a vis", 5, "Drama","Jesus Colmenar");
        series[4] = new Serie("Toy boy", 2, "Drama", "Javier Quintas");
    }
    private static void completingGames(Videojuegos[] videojuegos){
        videojuegos[0] = new Videojuegos("Star Craft", 120, "Fantasia", "Blizzard");
        videojuegos[1] = new Videojuegos("Army of Two", 115, "Estrategia", "EA");
        videojuegos[2] = new Videojuegos("GTA", 200, "Aventura", "RockStar Games");
        videojuegos[3] = new Videojuegos("Guitar Hero", 75, "Musica", "Activision");
        videojuegos[4] = new Videojuegos("Final Fantasy",95,"Fantasia", "Square Enix");
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

    private static void countSeriesDelivered(Serie[] series){
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

    private static void seriesAndSeasons(Serie[] series){
        Serie seriesAndSeason = new Serie("temporal", 0, "temporal", "temporal");

        for(int i = 0; i < series.length; i++){
            if(series[i].compareTo(seriesAndSeason)){
                seriesAndSeason = series[i];
            }
        }
        System.out.println("La serie con mas tiempo en horas es: ");
        System.out.println(seriesAndSeason);
    }

    private static void hoursGame(Videojuegos[] videojuegos){
        Videojuegos hoursGame = new Videojuegos("Temporal", 0);

        for(Videojuegos juego : videojuegos){
            if(juego.compareTo(hoursGame)){
                hoursGame = juego;
            }
        }
        System.out.println("El video juego con mas tiempo  en horas es: "+ hoursGame);

    }

    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuegos[] videojuegos = new Videojuegos[5];

        completingSeries(series);
        completingGames(videojuegos);

        deliverSeries(series);
        deliverJuegos(videojuegos);


        countSeriesDelivered(series);
        countSeriesDelivered(videojuegos);
        seriesAndSeasons(series);
        hoursGame(videojuegos);
    }
}
