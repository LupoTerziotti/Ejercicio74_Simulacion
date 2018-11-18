package Logica;

public enum EstadoSemaforo {


    EnVerde("Verde"),
    EnAmarillo("Amarillo"),
    EnRojo("Rojo");


    private final String name;

    private EstadoSemaforo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
