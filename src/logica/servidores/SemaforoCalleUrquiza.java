package logica.servidores;

import logica.Auto;
import logica.EstadoSemaforo;
import logica.Reloj;

import java.util.LinkedList;

public class SemaforoCalleUrquiza {

    private EstadoSemaforo estadoSemaforo;
    private double tiempoEnEstado;
    private double proxCambioDeEstado;
    private int cantidadDeAutos;
    private LinkedList<Auto> cola;

    public SemaforoCalleUrquiza() {
        this.estadoSemaforo = EstadoSemaforo.EnRojo;
        this.tiempoEnEstado = tiempoRojo();
        calcularProxCambioDeEstado();
        this.cola = new LinkedList<Auto>();
    }


    public void calcularTiempoEnEstado() {
        if(EstadoSemaforo.EnVerde == getEstadoSemaforo())
        {
            tiempoEnEstado=tiempoAmarillo();
        }else if(EstadoSemaforo.EnAmarillo==getEstadoSemaforo())
        {
            tiempoEnEstado=tiempoRojo();
        }else {
            tiempoEnEstado=tiempoVerde();
        }
    }
    public double tiempoAmarillo()
    {
        return 10;
    }

    public double tiempoVerde()
    {
        return 45;
    }

    public double tiempoRojo()
    {
        return 35;
    }

    public void calcularProxCambioDeEstado()
    {
        setProxCambioDeEstado(this.getTiempoEnEstado()+Reloj.getInstancia().getTiempoActual());
    }

    public EstadoSemaforo getEstadoSemaforo() {
        return estadoSemaforo;
    }

    public void setEstadoSemaforo(EstadoSemaforo estadoSemaforo) {
        this.estadoSemaforo = estadoSemaforo;
    }

    public double getTiempoEnEstado() {
        calcularTiempoEnEstado();
        return tiempoEnEstado;
    }

    public void setTiempoEnEstado(double tiempoEnEstado) {
        this.tiempoEnEstado = tiempoEnEstado;
    }

    public void setProxCambioDeEstado(double proxCambioDeEstado) {
        this.proxCambioDeEstado = proxCambioDeEstado;
    }

    public void agregarACola(Auto a)
    {
        cola.add(a);
        cantidadDeAutos++;
    }

    public LinkedList<Auto> getCola() {
        return cola;
    }

    public void setCola(LinkedList<Auto> cola) {
        this.cola = cola;
    }

    public double getProxCambioDeEstado() {
        return proxCambioDeEstado;
    }
}
