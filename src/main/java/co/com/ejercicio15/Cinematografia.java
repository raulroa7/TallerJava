package co.com.ejercicio15;

import java.util.Scanner;

public class Cinematografia {

    public static void menu(int opcionmenu) {
        while (opcionmenu != 8){
            if (opcionmenu > 8 || opcionmenu < 1) {
                switch (opcionmenu) {
                    default:
                        System.out.println("******** La opción seleccionada " + opcionmenu + " no hace parte del menú ********");
                        break;
                }
            }
            mostrar(); break;
        }
    }

    public static void main(String[] args){
        System.out.println("********************GESTIÓN CINEMATOGRÁFICA********************");
        mostrar();
    }

    public static void mostrar(){
        Scanner teclado = new Scanner(System.in);
        String usuario;
        System.out.println("1. Nuevo actor\n2. Buscar actor\n3. Eliminar actor\n4. Modificar actor\n5. Ver todos los actores\n6. Ver las peliculas de los actores\n7. Ver categoria de las peliculas\n8. Salir");
        System.out.println("Señor usuario ingrese a una de las 8 opciones presentadas");
        usuario = teclado.nextLine();
        menu(Integer.parseInt(usuario));
    }
}
