package co.com.ejercicio7;

import java.util.Scanner;

public class TestEj7 {

    public static void main (String[] args) {

        double num;
        ComparaCero comparador = new ComparaCero();
        Scanner dato = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero mayor a cero");
            num = Double.parseDouble(dato.nextLine());

        }while (num <= 0);

        comparador.comparar_numero(num);
    }
}
