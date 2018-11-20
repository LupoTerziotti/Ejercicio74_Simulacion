package Logica.Servidores;

import Logica.Auto;
import Logica.EstadoSemaforo;
import Logica.Reloj;

import java.util.LinkedList;

public class SemaforoCalleColon {

    private EstadoSemaforo estadoSemaforo;
    private double tiempoEnEstado;
    private double proxCambioDeSemaforo;
    private int cantidadDeAutos;
    private LinkedList<Auto> cola;

    public SemaforoCalleColon() {
        this.estadoSemaforo = EstadoSemaforo.EnVerde;
        this.tiempoEnEstado = tiempoVerde();
        this.proxCambioDeSemaforo = getProxCambioDeSemaforo();
        this.cola = new LinkedList<Auto>();
    }


    public EstadoSemaforo getEstadoSemaforo() {
        return estadoSemaforo;
    }

    public void setEstadoSemaforo(EstadoSemaforo estadoSemaforo) {
        this.estadoSemaforo = estadoSemaforo;
    }

    public double getTiempoEnEstado() {
        return tiempoEnEstado;
    }

    public void setTiempoEnEstado(double tiempoEnEstado) {
        this.tiempoEnEstado = tiempoEnEstado;
    }

    public double getProxCambioDeSemaforo() {
        if(EstadoSemaforo.EnVerde == getEstadoSemaforo())
        {
            return tiempoEnEstado+tiempoAmarillo();
        }else if(EstadoSemaforo.EnAmarillo==getEstadoSemaforo())
        {
            return tiempoEnEstado+tiempoRojo();
        }else {
            return tiempoEnEstado+tiempoVerde();
        }
    }

    public double getProxCambioDeSemaforoAVerde()
    {
        return Reloj.getInstancia().getTiempoActual()+90;
    }

    public double getProxCambioDeSemaforoAAmarillo()
    {
        return Reloj.getInstancia().getTiempoActual()+90;
    }

    public double getProxCambioDeSemaforoARojo()
    {
        return Reloj.getInstancia().getTiempoActual()+90;
    }


    public void setProxCambioDeSemaforo(double proxCambioDeSemaforo) {
        this.proxCambioDeSemaforo = proxCambioDeSemaforo;
    }

    public void agregarACola(Auto a)
    {
        cola.add(a);
        cantidadDeAutos++;

    }
    public void calcularProxCambioDeEstado()
    {
        setProxCambioDeSemaforo(this.getTiempoEnEstado()+Reloj.getInstancia().getTiempoActual());
    }


    public LinkedList<Auto> getCola() {
        return cola;
    }

    public void setCola(LinkedList<Auto> cola) {
        this.cola = cola;
    }

    public int tiempoAmarillo()
    {
        return 10;
    }

    public int tiempoVerde()
    {
        return 25;
    }

    public int tiempoRojo()
    {
        return 55;
    }
}
