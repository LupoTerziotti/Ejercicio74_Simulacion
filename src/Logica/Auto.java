package Logica;

public class Auto {
    private int numero;
    private double tiempoDeEntrada;

    public Auto(int numero, double tiempoDeEntrada) {
        this.numero = numero;
        this.tiempoDeEntrada = tiempoDeEntrada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNumeroString() {

        return (this.numero != 0) ? Integer.toString(getNumero()) : "-";
    }
}

