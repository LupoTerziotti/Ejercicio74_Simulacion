package logica.eventos;

import logica.EstadoSemaforo;
import logica.Evento;
import logica.servidores.SemaforoCalleColon;

public class CambioAARojoCalleColon extends Evento {

    private SemaforoCalleColon semaforoCalleColon;


    public CambioAARojoCalleColon(SemaforoCalleColon semaforoCalleColon) {
        this.semaforoCalleColon = semaforoCalleColon;
    }

    public void ejecutar()
    {
        this.semaforoCalleColon.setEstadoSemaforo(EstadoSemaforo.EnRojo);
        this.semaforoCalleColon.calcularProxCambioDeEstado();
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Rojo Calle Colón";
        return nombre;
    }
}
