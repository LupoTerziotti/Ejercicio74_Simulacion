package logica.eventos;

import logica.Auto;
import logica.Evento;
import logica.Reloj;
import logica.servidores.SemaforoCalleColon;

public class LlegadaDeAutoCalleColon extends Evento {

    private double tiempoLlegada;
    private int contadorAutos ;
    private double proxLlegadaAuto;
    private Auto auto;
    private double randomLlegada;
    private SemaforoCalleColon semaforoCalleColon;

    public LlegadaDeAutoCalleColon(SemaforoCalleColon semaforoCalleColon) {
        this.semaforoCalleColon = semaforoCalleColon;
        this.auto=generarAuto();

    }

    public void ejecutar()
    {
        this.auto=generarAuto();
        semaforoCalleColon.agregarACola(auto);
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
        double demora = (2 + 2* this.getRandomLlegada()*3600) ;
        this.tiempoLlegada = (demora / 60);
    }

    public void calcularProxLlegadaAuto()
    {
        setProxLlegadaAuto(this.getTiempoLlegada()+ Reloj.getInstancia().getTiempoActual());
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

    public String getTiempoLlegada1()
    {
        return Reloj.tiempoString(getTiempoLlegada());
    }

    public String getProxLlegadaAuto1()
    {
        return Reloj.tiempoString(getProxLlegadaAuto());
    }
}
