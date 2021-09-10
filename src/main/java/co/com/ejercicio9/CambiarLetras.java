package co.com.ejercicio9;

public class CambiarLetras {

    /** Atributo*/
    private String frase;
    private String frasePropia;

    /**Constructor**/

    public CambiarLetras (String frasePropia) {
        this.frase = "La sonrisa sera la mejor arma contra la tristeza";
        this.frasePropia = frasePropia;
    }

    public void setFrase(String frase){
        this.frase = frase;
    }
    public String getFrase(){
        return frase;
    }
    public void CambiarLetras(){
        System.out.println(this.frase.replace("a", "e"));
    }
    public String UnirFrases(){
        return this.frase + " "+ this.frasePropia;
    }

    public boolean unirFrases(){

        return false;
    }
}




