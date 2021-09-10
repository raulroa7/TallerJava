package co.com.ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ejercicio13 {

    public static void main(String[] args) {
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println("yyyy/MM/dd hh:mm:ss -> formato de fecha " + dtf5.format(LocalDateTime.now()));
    }
}