package logica.eventos;

import logica.EstadoSemaforo;
import logica.Evento;
import logica.servidores.SemaforoCalleColon;

public class CambioAVerdeCalleColon extends Evento {
    private SemaforoCalleColon semaforoCalleColon;


    public CambioAVerdeCalleColon(SemaforoCalleColon semaforoCalleColon) {
       this.semaforoCalleColon = semaforoCalleColon;
    }

    public void ejecutar()
    {

        this.semaforoCalleColon.setEstadoSemaforo(EstadoSemaforo.EnVerde);
        this.semaforoCalleColon.calcularProxCambioDeEstado();
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Verde Calle Colón";
        return nombre;
    }

    public SemaforoCalleColon getSemaforoCalleColon() {
        return semaforoCalleColon;
    }

    public void setSemaforoCalleColon(SemaforoCalleColon semaforoCalleColon) {
        this.semaforoCalleColon = semaforoCalleColon;
    }
}
