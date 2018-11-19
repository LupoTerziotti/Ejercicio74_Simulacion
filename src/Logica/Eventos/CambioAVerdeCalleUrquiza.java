package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleUrquiza;

public class CambioAVerdeCalleUrquiza extends Evento {


    private SemaforoCalleUrquiza semaforoCalleUrquiza;

    public CambioAVerdeCalleUrquiza(SemaforoCalleUrquiza semaforoCalleUrquiza) {
        this.semaforoCalleUrquiza=semaforoCalleUrquiza;
    }
    public void ejecutar()
    {
        this.semaforoCalleUrquiza.setEstadoSemaforo(EstadoSemaforo.EnVerde);
        this.semaforoCalleUrquiza.calcularProxCambioDeEstado();
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Verde Calle Urquiza";
        return nombre;
    }
}
