package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleColón;

public class CambioAVerdeCalleColón extends Evento {
    private SemaforoCalleColón semaforoCalleColón;


    public CambioAVerdeCalleColón(SemaforoCalleColón semaforoCalleColón) {
       this.semaforoCalleColón=semaforoCalleColón;
    }

    public void ejecutar()
    {

        semaforoCalleColón.setEstadoSemaforo(EstadoSemaforo.EnVerde);
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Verde Calle Colón";
        return nombre;
    }

    public SemaforoCalleColón getSemaforoCalleColón() {
        return semaforoCalleColón;
    }

    public void setSemaforoCalleColón(SemaforoCalleColón semaforoCalleColón) {
        this.semaforoCalleColón = semaforoCalleColón;
    }
}
