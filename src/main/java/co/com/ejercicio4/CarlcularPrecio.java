package co.com.ejercicio4;

public class CarlcularPrecio {
    //Atributos
    private final double IVA= 0.21;
    private double precio;
    // Metodos
    public CarlcularPrecio(double precio) {
        this.precio = precio;

    }
    public void carlcularPrecio(){
        double aumento= this.precio*IVA;
        System.out.println("El precio final es: "+ (this.precio+(aumento)));
    }
}
