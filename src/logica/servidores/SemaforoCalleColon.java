package logica.servidores;

import logica.Auto;
import logica.EstadoSemaforo;
import logica.Reloj;

import java.util.LinkedList;

public class SemaforoCalleColon {

    private EstadoSemaforo estadoSemaforo;
    private double tiempoEnEstado;
    private double proxCambioDeEstado;
    private int cantidadDeAutos;
    private LinkedList<Auto> cola;

    public SemaforoCalleColon() {
        this.estadoSemaforo = EstadoSemaforo.EnVerde;
        this.tiempoEnEstado = tiempoVerde();
        calcularProxCambioDeEstado();
        this.cola = new LinkedList<Auto>();
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

    public void setProxCambioDeEstado(double proxCambioDeEstado) {
        this.proxCambioDeEstado = proxCambioDeEstado;
    }

    public void agregarACola(Auto a)
    {
        cola.add(a);
        cantidadDeAutos++;

    }
    public void calcularProxCambioDeEstado()
    {
        setProxCambioDeEstado(this.getTiempoEnEstado()+Reloj.getInstancia().getTiempoActual());
    }


    public LinkedList<Auto> getCola() {
        return cola;
    }

    public void setCola(LinkedList<Auto> cola) {
        this.cola = cola;
    }

    public double tiempoAmarillo()
    {
        return 10;
    }

    public double tiempoVerde()
    {
        return 25;
    }

    public double tiempoRojo()
    {
        return 55;
    }


    public double getProxCambioDeEstado() {
        return proxCambioDeEstado;
    }

    public int getCantidadDeAutos() {
        return cantidadDeAutos;
    }

    public void setCantidadDeAutos(int cantidadDeAutos) {
        this.cantidadDeAutos = cantidadDeAutos;
    }
}
