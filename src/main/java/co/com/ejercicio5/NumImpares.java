package co.com.ejercicio5;

public class NumImpares {
    private int num = 0;
    int num_limit = 1000;

    public NumImpares(int number) {
        this.num = number;
    }

    public void inPares() {
        System.out.println("Ingrese un numero y vera un contador a partir de el numero ingresado hasta mil con saltos de dos en dos");
        while (this.num <= this.num_limit) {
            if (this.num % 2 == 0) {
                System.out.println(this.num);
            }
            num++;
        }
    }
}
