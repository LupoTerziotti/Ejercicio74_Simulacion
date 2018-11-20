package logica.eventos;

import logica.EstadoSemaforo;
import logica.Evento;
import logica.servidores.SemaforoCalleColon;

public class CambioAAmarilloCalleColon extends Evento {

    private SemaforoCalleColon semaforoCalleColon;


    public CambioAAmarilloCalleColon(SemaforoCalleColon semaforoCalleColon) {
        this.semaforoCalleColon = semaforoCalleColon;
    }
    public void ejecutar()
    {
        this.semaforoCalleColon.setEstadoSemaforo(EstadoSemaforo.EnAmarillo);
        this.semaforoCalleColon.calcularProxCambioDeEstado();
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Amarillo Calle Colón";
        return nombre;
    }
}
