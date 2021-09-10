import co.com.sofkaejercicio1.Ejercicio2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1= scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2= scanner.nextInt();
        Ejercicio2  ejercicio= new Ejercicio2(num1,num2);

        ejercicio.CompararNumero();
            }
}
