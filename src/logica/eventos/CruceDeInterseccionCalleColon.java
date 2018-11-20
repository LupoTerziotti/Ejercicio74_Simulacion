package logica.eventos;

import logica.EstadoSemaforo;
import logica.Evento;
import logica.servidores.SemaforoCalleColon;

public class CruceDeInterseccionCalleColon extends Evento {

    private SemaforoCalleColon semaforoCalleColon;
    private double tiempoCruce;
    private double proxCruce;
    private double randomCruce;

    public CruceDeInterseccionCalleColon(SemaforoCalleColon semaforoCalleColon) {

        this.semaforoCalleColon = semaforoCalleColon;
        calcularTiempoCruce();
    }

    public void ejecutar()
    {
        if(semaforoCalleColon.getCola().size() >= 2 && semaforoCalleColon.getEstadoSemaforo()== EstadoSemaforo.EnVerde)
        {
            this.semaforoCalleColon.getCola().pollFirst();
            this.semaforoCalleColon.getCola().pollFirst();
        }else if(semaforoCalleColon.getEstadoSemaforo()==EstadoSemaforo.EnVerde)
        {
            this.semaforoCalleColon.getCola().pollFirst();
        }
    }


    public void calcularTiempoCruce()
    {
        this.setRandomCruce(Math.random());
        double demora = (3.5 + this.getRandomCruce()) * 3600;
        this.tiempoCruce = (demora / 60);
    }

    public void CalcluarProximoCruce(double relojActual) {
        if(semaforoCalleColon.getEstadoSemaforo()== EstadoSemaforo.EnVerde)
        {
            setProxCruce(tiempoCruce+relojActual);
        }
    }

    public String getNombre()
    {
        String nombre= "Cruce De Interseccion Calle Colón";
        return nombre;
    }

    public SemaforoCalleColon getSemaforoCalleColon() {
        return semaforoCalleColon;
    }

    public void setSemaforoCalleColon(SemaforoCalleColon semaforoCalleColon) {
        this.semaforoCalleColon = semaforoCalleColon;
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
