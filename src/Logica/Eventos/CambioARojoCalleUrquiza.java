package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleUrquiza;

public class CambioARojoCalleUrquiza extends Evento {

    private SemaforoCalleUrquiza semaforoCalleUrquiza;

    public CambioARojoCalleUrquiza(SemaforoCalleUrquiza semaforoCalleUrquiza) {
        this.semaforoCalleUrquiza=semaforoCalleUrquiza;
    }
    public void ejecutar()
    {
        this.semaforoCalleUrquiza.setEstadoSemaforo(EstadoSemaforo.EnRojo);
        this.semaforoCalleUrquiza.calcularProxCambioDeEstado();
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Rojo Calle Urquiza";
        return nombre;
    }
}
