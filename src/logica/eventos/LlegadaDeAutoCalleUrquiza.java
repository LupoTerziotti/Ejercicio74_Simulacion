package logica.eventos;

import logica.Auto;
import logica.Evento;
import logica.Reloj;
import logica.servidores.SemaforoCalleUrquiza;

public class LlegadaDeAutoCalleUrquiza extends Evento {

    private double tiempoLlegada;
    private int contadorAutos ;
    private double proxLlegadaAuto;
    private Auto auto;
    private double randomLlegada;
    private SemaforoCalleUrquiza semaforoCalleUrquiza;



    public LlegadaDeAutoCalleUrquiza( SemaforoCalleUrquiza semaforoCalleUrquiza) {

        this.contadorAutos++;
        this.semaforoCalleUrquiza=semaforoCalleUrquiza;
        this.auto=generarAuto();

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

    public void ejecutar()
    {
        semaforoCalleUrquiza.agregarACola(getAuto());
    }
    public String getNombre()
    {
        String nombre= "Llegada Auto Calle Urquiza";
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
        double demora = (1 + 2 * this.getRandomLlegada()) * 3600;
        this.tiempoLlegada = (demora / 60);
    }

    public void calcularProxLlegadaAuto()
    {
        setProxLlegadaAuto(this.getTiempoLlegada()+Reloj.getInstancia().getTiempoActual());
    }



    public SemaforoCalleUrquiza getSemaforoCalleUrquiza() {
        return semaforoCalleUrquiza;
    }

    public void setSemaforoCalleUrquiza(SemaforoCalleUrquiza semaforoCalleUrquiza) {
        this.semaforoCalleUrquiza = semaforoCalleUrquiza;
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
