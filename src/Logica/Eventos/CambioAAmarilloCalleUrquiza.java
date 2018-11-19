package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleUrquiza;

public class CambioAAmarilloCalleUrquiza extends Evento {

    private SemaforoCalleUrquiza semaforoCalleUrquiza;


    public CambioAAmarilloCalleUrquiza(SemaforoCalleUrquiza semaforoCalleUrquiza) {
        this.semaforoCalleUrquiza=semaforoCalleUrquiza;

    }
    public void ejecutar()
    {
        this.semaforoCalleUrquiza.setEstadoSemaforo(EstadoSemaforo.EnAmarillo);
        this.semaforoCalleUrquiza.calcularProxCambioDeEstado();
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Amarillo Calle Urquiza";
        return nombre;
    }
}
