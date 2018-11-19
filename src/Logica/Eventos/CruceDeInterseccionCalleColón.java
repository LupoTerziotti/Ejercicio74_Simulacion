package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleColón;

public class CruceDeInterseccionCalleColón extends Evento {

    private SemaforoCalleColón semaforoCalleColón;
    private double tiempoCruce;
    private double proxCruce;
    private double randomCruce;

    public CruceDeInterseccionCalleColón( SemaforoCalleColón semaforoCalleColón) {

        this.semaforoCalleColón = semaforoCalleColón;
        calcularTiempoCruce();
    }

    public void ejecutar()
    {
        if(semaforoCalleColón.getCola().size() >= 2 && semaforoCalleColón.getEstadoSemaforo()== EstadoSemaforo.EnVerde)
        {
            semaforoCalleColón.getCola().pollFirst();
            semaforoCalleColón.getCola().pollFirst();
        }else if(semaforoCalleColón.getEstadoSemaforo()==EstadoSemaforo.EnVerde)
        {
            semaforoCalleColón.getCola().pollFirst();
        }
    }


    public void calcularTiempoCruce()
    {
        this.setRandomCruce(Math.random());
        double demora = (3.5 + this.getRandomCruce()) * 3600;
        this.tiempoCruce = (demora / 60);
    }

    public void proxCruce(double relojActual)
    {
        if(semaforoCalleColón.getEstadoSemaforo()== EstadoSemaforo.EnVerde)
        {
            this.proxCruce= tiempoCruce+relojActual;
        }
    }

    public String getNombre()
    {
        String nombre= "Cruce De Interseccion Calle Colón";
        return nombre;
    }

    public SemaforoCalleColón getSemaforoCalleColón() {
        return semaforoCalleColón;
    }

    public void setSemaforoCalleColón(SemaforoCalleColón semaforoCalleColón) {
        this.semaforoCalleColón = semaforoCalleColón;
    }

    public double getTiempoCruce() {
        return tiempoCruce;
    }

    public void setTiempoCruce(double tiempoCruce) {
        this.tiempoCruce = tiempoCruce;
    }

    public double getProxCruce() {
        return proxCruce;
    }

    public void setProxCruce(double proxCruce) {
        this.proxCruce = proxCruce;
    }

    public double getRandomCruce() {
        return randomCruce;
    }

    public void setRandomCruce(double randomCruce) {
        this.randomCruce = randomCruce;
    }
}
