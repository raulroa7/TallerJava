package co.com.sofkaejercicio1;

public class Ejercicio1 {
    int var1;
    int var2;

    public Ejercicio1(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public void CompararNumero(int a, int b){
        if(this.var1>this.var2) {
            System.out.println("El numero mayor es : "+ this.var1);
        }
        else if (this.var1<this.var2){
            System.out.println("El numero mayor es : "+ this.var2);
        }
        else System.out.println("los numeros iguales ");
            }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }
}
