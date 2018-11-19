package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleColón;

public class CambioAAmarilloCalleColón extends Evento {

    private SemaforoCalleColón semaforoCalleColón;


    public CambioAAmarilloCalleColón(SemaforoCalleColón semaforoCalleColón) {
        this.semaforoCalleColón=semaforoCalleColón;
    }
    public void ejecutar()
    {
        this.semaforoCalleColón.setEstadoSemaforo(EstadoSemaforo.EnAmarillo);
        this.semaforoCalleColón.calcularProxCambioDeEstado();
    }
    public String getNombre()
    {
        String nombre= "Cambio de Semaforo a Amarillo Calle Colón";
        return nombre;
    }
}
