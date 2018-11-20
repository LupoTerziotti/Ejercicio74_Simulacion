package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleColon;

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
