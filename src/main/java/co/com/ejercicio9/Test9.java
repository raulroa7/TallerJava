package co.com.ejercicio9;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args){
        String miFrase;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite una frase: ");
        miFrase = sc.nextLine();

        CambiarLetras frase= new CambiarLetras(miFrase);

        System.out.println(frase.getFrase()+ "\n");
        System.out.println(frase.unirFrases()+ "\n");

        frase.CambiarLetras();
        sc.close();
    }
}
