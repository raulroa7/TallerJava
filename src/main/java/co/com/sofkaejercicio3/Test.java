package co.com.sofkaejercicio3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double radio;
        System.out.println("Ingrese el radio: ");
        radio= Double.parseDouble(input.nextLine());
        AreaCirculo area= new AreaCirculo(radio);
        System.out.println("El area del ciruclo es : "+ area.calcularArea());
        input.close();
    }
}
