package Logica.Eventos;

import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Servidores.SemaforoCalleUrquiza;

public class CruceDeInterseccionCalleUrquiza extends Evento {

    private SemaforoCalleUrquiza semaforoCalleUrquiza;
    private double tiempoCruce;
    private double proxCruce;
    private double randomCruce;

    public CruceDeInterseccionCalleUrquiza( SemaforoCalleUrquiza semaforoCalleUrquiza) {

        this.semaforoCalleUrquiza = semaforoCalleUrquiza;
        calcularTiempoCruce();
    }

    public void ejecutar()
    {
        if(semaforoCalleUrquiza.getCola().size() >= 3 && semaforoCalleUrquiza.getEstadoSemaforo()== EstadoSemaforo.EnVerde)
        {
            semaforoCalleUrquiza.getCola().pollFirst();
            semaforoCalleUrquiza.getCola().pollFirst();
            semaforoCalleUrquiza.getCola().pollFirst();

        }else if(semaforoCalleUrquiza.getCola().size() >= 2 && semaforoCalleUrquiza.getEstadoSemaforo()==EstadoSemaforo.EnVerde)
        {
            semaforoCalleUrquiza.getCola().pollFirst();
            semaforoCalleUrquiza.getCola().pollFirst();
        }else if(semaforoCalleUrquiza.getEstadoSemaforo()==EstadoSemaforo.EnVerde)
        {
            semaforoCalleUrquiza.getCola().pollFirst();
        }
    }


    public void calcularTiempoCruce()
    {
        this.setRandomCruce(Math.random());
        double demora = (3.5 + this.getRandomCruce()) * 3600;
        this.tiempoCruce = (demora / 60);
    }

    public void CalcluarProximoCruce(double relojActual) {
        if(semaforoCalleUrquiza.getEstadoSemaforo()== EstadoSemaforo.EnVerde)
        {
            setProxCruce(tiempoCruce+relojActual);
        }
    }
    public String getNombre()
    {
        String nombre= "Cruce De Interseccion Calle Urquiza";
        return nombre;
    }


    public SemaforoCalleUrquiza getSemaforoCalleUrquiza() {
        return semaforoCalleUrquiza;
    }

    public void setSemaforoCalleUrquiza(SemaforoCalleUrquiza semaforoCalleUrquiza) {
        this.semaforoCalleUrquiza = semaforoCalleUrquiza;
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
