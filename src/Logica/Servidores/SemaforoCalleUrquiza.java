package Logica.Servidores;

import Logica.Auto;
import Logica.EstadoSemaforo;
import Logica.Reloj;

import java.util.LinkedList;

public class SemaforoCalleUrquiza {

    private EstadoSemaforo estadoSemaforo;
    private double tiempoEnEstado;
    private double proxCambioDeSemaforo;
    private double proxCambioDeSemaforoAVerde;
    private double proxCambioDeSemaforoAAmarillo;
    private double proxCambioDeSemaforoARojo;
    private int cantidadDeAutos;
    private LinkedList<Auto> cola;

    public SemaforoCalleUrquiza() {
        this.estadoSemaforo = EstadoSemaforo.EnRojo;
        this.tiempoEnEstado = 0;
        this.proxCambioDeSemaforo = 0;
        this.cantidadDeAutos=0;
        this.cola = new LinkedList<Auto>();
    }

    public void calcularProxCambioDeEstado()
    {
        if(estadoSemaforo==EstadoSemaforo.EnVerde)
        {
            setProxCambioDeSemaforo(Reloj.getInstancia().getTiempoActual()+tiempoAmarillo());
        }
        if(estadoSemaforo==EstadoSemaforo.EnAmarillo)
        {
            setProxCambioDeSemaforo(Reloj.getInstancia().getTiempoActual()+tiempoRojo());
        }
        if(estadoSemaforo==EstadoSemaforo.EnRojo)
        {
            setProxCambioDeSemaforo(Reloj.getInstancia().getTiempoActual()+tiempoVerde());
        }
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

    public LinkedList<Auto> getCola() {
        return cola;
    }

    public void setCola(LinkedList<Auto> cola) {
        this.cola = cola;
    }

    public double getProxCambioDeSemaforo() {
        return proxCambioDeSemaforo;
    }
}
