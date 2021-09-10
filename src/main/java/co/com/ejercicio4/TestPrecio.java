package co.com.ejercicio4;

import java.util.Scanner;

public class TestPrecio {
    public static void main(String[] args) {
        double inPrecio;
        Scanner inputPrecio= new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        inPrecio= inputPrecio.nextDouble();
        CarlcularPrecio calPrecio= new CarlcularPrecio(inPrecio);
        calPrecio.carlcularPrecio();

    }
}
