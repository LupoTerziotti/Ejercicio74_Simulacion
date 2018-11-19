package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleColón;

public class CambioAARojoCalleColón extends Evento {

    private SemaforoCalleColón semaforoCalleColón;


    public CambioAARojoCalleColón(SemaforoCalleColón semaforoCalleColón) {
        this.semaforoCalleColón=semaforoCalleColón;
    }

    public void ejecutar()
    {
        this.semaforoCalleColón.setEstadoSemaforo(EstadoSemaforo.EnRojo);
        this.semaforoCalleColón.calcularProxCambioDeEstado();
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Rojo Calle Colón";
        return nombre;
    }
}
