package co.com.ejercicio17;

import java.util.ArrayList;

public class Ejecutable {

    ArrayList<Electrodomestico> electrodomesticos;

    public Ejecutable(){

        electrodomesticos = new ArrayList<>();
    }

    public void ArregloElectrodomestico(){

        Electrodomestico electrodomestico_1 = new Electrodomestico();
        Electrodomestico electrodomestico_2 = new Electrodomestico(1500000, 150000);
        Electrodomestico electrodomestico_3 = new Electrodomestico(1200000, 250000, Electrodomestico.negro, Electrodomestico.B);
        Lavadora lavadora_1 = new Lavadora();
        Lavadora lavadora_2 = new Lavadora(1800000, 13);
        Lavadora lavadora_3 = new Lavadora(23);
        Televisore tv_1 = new Televisore();
        Televisore tv_2 = new Televisore(2500000, 1500);
        Televisore tv_3 = new Televisore(1600, true);
        Televisore tv_4 = new Televisore(1140, true);

        electrodomesticos.add(electrodomestico_1);
        electrodomesticos.add(electrodomestico_2);
        electrodomesticos.add(electrodomestico_3);
        electrodomesticos.add(lavadora_1);
        electrodomesticos.add(lavadora_2);
        electrodomesticos.add(lavadora_3);
        electrodomesticos.add(tv_1);
        electrodomesticos.add(tv_2);
        electrodomesticos.add(tv_3);
        electrodomesticos.add(tv_4);

    }

    public void PrecioElectrodomesticos(){

        float Electrodomesticos = 0;
        float precioLavadoras = 0;
        float precioTelevisres = 0;

        for(int i = electrodomesticos.size() -1; i >= 0; i--){
            if(electrodomesticos.get(i) instanceof Televisore){
                System.out.println("Precio del tv en la posicion "+ i +": " + electrodomesticos.get(i).precioFinal());
                precioTelevisres += electrodomesticos.get(i).precioFinal();
            }else if (electrodomesticos.get(i) instanceof Lavadora){
                System.out.println("Precio de la lavadora en la posicion" + i + ": " + electrodomesticos.get(i).precioFinal());
                precioLavadoras += electrodomesticos.get(i).precioFinal();
            }else{
                System.out.println("Precio del electrodomestico en la posicion" +i+": " + electrodomesticos.get(i).precioFinal());
                Electrodomesticos += electrodomesticos.get(i).precioFinal();
            }

        }

        System.out.println("Precio tvs: " + precioTelevisres);
        System.out.println("Precio lavadoras: " + precioLavadoras);
        System.out.println("Precio electrodomesticos: " + (precioTelevisres + precioLavadoras + Electrodomesticos));
    }
}
