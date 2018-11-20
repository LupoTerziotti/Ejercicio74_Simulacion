package Logica.Eventos;

import Logica.Auto;
import Logica.EstadoSemaforo;
import Logica.Evento;
import Logica.Reloj;
import Logica.Servidores.SemaforoCalleColón;

public class LlegadaDeAutoCalleColón extends Evento {

    private double tiempoLlegada;
    private int contadorAutos ;
    private double proxLlegadaAuto;
    private Auto auto;
    private double randomLlegada;
    private SemaforoCalleColón semaforoCalleColón;

    public LlegadaDeAutoCalleColón(SemaforoCalleColón semaforoCalleColón) {
        this.semaforoCalleColón = semaforoCalleColón;
        this.auto=generarAuto();
    }

    public void ejecutar()
    {

        semaforoCalleColón.agregarACola(auto);

    }

    public String getNombre()
    {
        String nombre= "Llegada Auto Calle Colón";
        return nombre;
    }

    public Auto generarAuto()
    {
        Auto auto = new Auto(getContadorAutos(), Reloj.getInstancia().getTiempoActual());
        this.randomLlegada = Math.random();
        this.calcularTiempoLlegadaAuto();
        this.calcularProxLlegadaAuto();
        return auto;
    }

    public void calcularTiempoLlegadaAuto()
    {
        this.setRandomLlegada(Math.random());
        double demora = (2 + 2* this.getRandomLlegada()) * 3600;
        this.tiempoLlegada = (demora / 60);
    }

    public void calcularProxLlegadaAuto()
    {
        setProxLlegadaAuto(this.getTiempoLlegada()+Reloj.getInstancia().getTiempoActual());
    }



    public double getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(double tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getContadorAutos() {
        return contadorAutos;
    }

    public void setContadorAutos(int contadorAutos) {
        this.contadorAutos = contadorAutos;
    }

    public double getProxLlegadaAuto() {
        return proxLlegadaAuto;
    }

    public void setProxLlegadaAuto(double proxLlegadaAuto) {
        this.proxLlegadaAuto = proxLlegadaAuto;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public double getRandomLlegada() {
        return randomLlegada;
    }

    public void setRandomLlegada(double randomLlegada) {
        this.randomLlegada = randomLlegada;
    }
}
