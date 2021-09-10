package co.com.ejercicio10;

import java.util.Scanner;

    public final class DelGaps {
    Scanner scanner= new Scanner(System.in);

    private String noGaps=" ";

    private DelGaps(){
        this.scanner = scanner;
    }

    public String TakeGaps(){
        System.out.println("Ingresa una frase: ");
        String text= scanner.nextLine();
        for (int x=0; x<text.length(); x++) {
            char remove = text.charAt(x);
            if (remove != ' ') {
                noGaps += String.valueOf(remove);
            }
        }
            return noGaps;
    }
}