package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleUrquiza;

public class CambioAAmarilloCalleUrquiza extends Evento {

    private SemaforoCalleUrquiza semaforoCalleUrquiza;

    public CambioAAmarilloCalleUrquiza(SemaforoCalleUrquiza semaforoCalleUrquiza) {
        this.semaforoCalleUrquiza=semaforoCalleUrquiza;
        this.semaforoCalleUrquiza.calcularProxCambioDeEstado();
    }
    public void ejecutar()
    {
        semaforoCalleUrquiza.setEstadoSemaforo(EstadoSemaforo.EnAmarillo);
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Amarillo Calle Urquiza";
        return nombre;
    }
}
