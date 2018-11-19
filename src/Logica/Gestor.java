package Logica;

import Logica.Eventos.*;
import Logica.Servidores.SemaforoCalleColón;
import Logica.Servidores.SemaforoCalleUrquiza;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.Fila;

import java.util.ArrayList;

public class Gestor {

    private int cantAutosCruzados;
    private double tiempoPermanencia;
    private ObservableList<Fila> data;
    private ArrayList<String> conjuntoEventos;
    private static Evento eventoActual;
    private int dia;
    private int diaDesde;
    private int diaHasta;
    private SemaforoCalleUrquiza servidorSemaforoCalleUrquiza;
    private SemaforoCalleColón servidorSemaforoCalleCólon;
    private LlegadaDeAutoCalleUrquiza llegadaDeAutoCalleUrquiza;
    private LlegadaDeAutoCalleColón llegadaDeAutoCalleColón;
    private CruceDeInterseccionCalleColón cruceDeInterseccionCalleColón;
    private CruceDeInterseccionCalleUrquiza cruceDeInterseccionCalleUrquiza;


    public Gestor() {

        this.conjuntoEventos = new ArrayList<>();
        this.data = FXCollections.observableArrayList();
        this.dia = dia;
        this.diaDesde = diaDesde;
        this.diaHasta = diaHasta;
        this.servidorSemaforoCalleUrquiza = new SemaforoCalleUrquiza() ;
        this.servidorSemaforoCalleCólon =new SemaforoCalleColón();
        this.llegadaDeAutoCalleUrquiza = new LlegadaDeAutoCalleUrquiza(getServidorSemaforoCalleUrquiza());
        this.llegadaDeAutoCalleColón = new LlegadaDeAutoCalleColón(getServidorSemaforoCalleCólon());
        this.cruceDeInterseccionCalleUrquiza= new CruceDeInterseccionCalleUrquiza(getServidorSemaforoCalleUrquiza());
        this.cruceDeInterseccionCalleColón= new CruceDeInterseccionCalleColón(getServidorSemaforoCalleCólon());
    }

    public void inicio()
    {

        setEventoActual(llegadaDeAutoCalleUrquiza);
        this.getConjuntoEventos().add(this.getEventoActual().getNombre());
        Reloj.getInstancia().setTiempoActual(llegadaDeAutoCalleUrquiza.getProxLlegadaAuto());
        llegadaDeAutoCalleUrquiza.ejecutar();
        this.llegadaDeAutoCalleUrquiza.setAuto(llegadaDeAutoCalleUrquiza.generarAuto());
        //this.cargarFila(true);
        iterar();
    }


    public void iterar()
    {

        while(Reloj.getInstancia().getTiempoActual()/3600 < 12 )//Hora de cierre
        {

            switch (proxEvento())
            {
                case "Llegada Auto Calle Colón":
                    this.setEventoActual(llegadaDeAutoCalleColón);
                    this.getConjuntoEventos().add(this.getEventoActual().getNombre());
                    Reloj.getInstancia().setTiempoActual(llegadaDeAutoCalleColón.getProxLlegadaAuto());
                    llegadaDeAutoCalleColón.ejecutar();
                    this.llegadaDeAutoCalleColón.setAuto(llegadaDeAutoCalleColón.generarAuto());
                    //this.cargarFila();
                    break;

                case "Llegada Auto Calle Urquiza":
                    this.setEventoActual(llegadaDeAutoCalleUrquiza);
                    this.getConjuntoEventos().add(this.getEventoActual().getNombre());
                    Reloj.getInstancia().setTiempoActual(llegadaDeAutoCalleUrquiza.getProxLlegadaAuto());
                    llegadaDeAutoCalleUrquiza.ejecutar();
                    this.llegadaDeAutoCalleUrquiza.setAuto(llegadaDeAutoCalleUrquiza.generarAuto());
                    //this.cargarFila();
                    break;

                case "Cruce De Interseccion Calle Urquiza":
                    if(servidorSemaforoCalleUrquiza.getEstadoSemaforo()==EstadoSemaforo.EnVerde)
                    {
                        cruceDeInterseccionCalleUrquiza= new CruceDeInterseccionCalleUrquiza(servidorSemaforoCalleUrquiza);
                        this.setEventoActual(cruceDeInterseccionCalleUrquiza);
                        Reloj.getInstancia().setTiempoActual(cruceDeInterseccionCalleUrquiza.getProxCruce());
                        this.getConjuntoEventos().add(this.getEventoActual().getNombre());
                        this.getEventoActual().ejecutar();
                    }


                case "Cruce De Interseccion Calle Colón":
                    if(servidorSemaforoCalleCólon.getEstadoSemaforo()==EstadoSemaforo.EnVerde)
                    {
                        cruceDeInterseccionCalleColón= new CruceDeInterseccionCalleColón(servidorSemaforoCalleCólon);
                        this.setEventoActual(cruceDeInterseccionCalleColón);
                        Reloj.getInstancia().setTiempoActual(cruceDeInterseccionCalleColón.getProxCruce());
                        this.getConjuntoEventos().add(this.getEventoActual().getNombre());
                        this.getEventoActual().ejecutar();
                    }

                    break;

                case "Cambio de Semaforo a Verde Calle Colón":
                    CambioAVerdeCalleColón cambioAVerdeCalleColón= new CambioAVerdeCalleColón(servidorSemaforoCalleCólon);
                    this.setEventoActual(cambioAVerdeCalleColón);
                    Reloj.getInstancia().setTiempoActual(servidorSemaforoCalleCólon.getProxCambioDeSemaforoAVerde());
                    this.getConjuntoEventos().add(getEventoActual().getNombre());
                    this.getEventoActual().ejecutar();
                    break;
                case "Cambio de Semaforo a Amarillo Calle Colón":
                    CambioAAmarilloCalleColón cambioAAmarilloCalleColón= new CambioAAmarilloCalleColón(servidorSemaforoCalleCólon);
                    this.setEventoActual(cambioAAmarilloCalleColón);
                    Reloj.getInstancia().setTiempoActual(servidorSemaforoCalleCólon.getProxCambioDeSemaforoAAmarillo());
                    this.getConjuntoEventos().add(getEventoActual().getNombre());
                    this.getEventoActual().ejecutar();
                    break;

                case "Cambio de Semaforo a Rojo Calle Colón":
                    CambioAARojoCalleColón cambioAARojoCalleColón= new CambioAARojoCalleColón(servidorSemaforoCalleCólon);
                    this.setEventoActual(cambioAARojoCalleColón);
                    Reloj.getInstancia().setTiempoActual(servidorSemaforoCalleCólon.getProxCambioDeSemaforoARojo());
                    this.getConjuntoEventos().add(getEventoActual().getNombre());
                    this.getEventoActual().ejecutar();
                    break;

                case "Cambio de Semaforo a Verde Calle Urquiza":
                    CambioAVerdeCalleUrquiza cambioAVerdeCalleUrquiza= new CambioAVerdeCalleUrquiza(servidorSemaforoCalleUrquiza);
                    this.setEventoActual(cambioAVerdeCalleUrquiza);
                    Reloj.getInstancia().setTiempoActual(servidorSemaforoCalleUrquiza.getProxCambioDeSemaforoAVerde());
                    this.getConjuntoEventos().add(getEventoActual().getNombre());
                    this.getEventoActual().ejecutar();
                    break;

                case "Cambio de Semaforo a Amarillo Calle Urquiza":
                    CambioAAmarilloCalleUrquiza cambioAAmarilloCalleUrquiza=new CambioAAmarilloCalleUrquiza(servidorSemaforoCalleUrquiza);
                    this.setEventoActual(cambioAAmarilloCalleUrquiza);
                    Reloj.getInstancia().setTiempoActual(servidorSemaforoCalleUrquiza.getProxCambioDeSemaforoAAmarillo());
                    this.getConjuntoEventos().add(getEventoActual().getNombre());
                    this.getEventoActual().ejecutar();
                    break;

                case "Cambio de Semaforo a Rojo Calle Urquiza":
                    CambioARojoCalleUrquiza cambioARojoCalleUrquiza = new CambioARojoCalleUrquiza (servidorSemaforoCalleUrquiza);
                    this.setEventoActual(cambioARojoCalleUrquiza);
                    Reloj.getInstancia().setTiempoActual(servidorSemaforoCalleUrquiza.getProxCambioDeSemaforoARojo());
                    this.getConjuntoEventos().add(getEventoActual().getNombre());
                    this.getEventoActual().ejecutar();
                    break;

            }
        }
    }

    public double tiempoMinimo() {
        double minTiempo = 25920000;   //seteo el tiempo minimo en un valor bien alto para que pueda funcionar
        if (servidorSemaforoCalleUrquiza.getProxCambioDeSemaforoAAmarillo() != 0) {
            minTiempo = servidorSemaforoCalleUrquiza.getProxCambioDeSemaforoAAmarillo();
        }
        if (servidorSemaforoCalleCólon.getProxCambioDeSemaforo() < minTiempo && servidorSemaforoCalleCólon.getProxCambioDeSemaforo() !=0) {
            minTiempo = servidorSemaforoCalleCólon.getProxCambioDeSemaforo();
        }
        if (llegadaDeAutoCalleUrquiza.getProxLlegadaAuto() < minTiempo && llegadaDeAutoCalleUrquiza.getProxLlegadaAuto()!=0){
            minTiempo=llegadaDeAutoCalleUrquiza.getProxLlegadaAuto();
        }
        if(llegadaDeAutoCalleColón.getProxLlegadaAuto() < minTiempo && llegadaDeAutoCalleColón.getProxLlegadaAuto() !=0){
            minTiempo=llegadaDeAutoCalleColón.getProxLlegadaAuto();
        }
        if(cruceDeInterseccionCalleUrquiza.getProxCruce() < minTiempo && cruceDeInterseccionCalleUrquiza.getProxCruce()!=0)
        {
            minTiempo= cruceDeInterseccionCalleUrquiza.getProxCruce();
        }
        if(cruceDeInterseccionCalleColón.getProxCruce()< minTiempo && cruceDeInterseccionCalleColón.getProxCruce() !=0)
        {
            minTiempo= cruceDeInterseccionCalleColón.getProxCruce();
        }


        return minTiempo;
    }

    public String proxEvento() {
        double tiempo = tiempoMinimo();

        if (tiempo == servidorSemaforoCalleCólon.getProxCambioDeSemaforoAVerde()) {
            return "Cambio de Semaforo a Verde Calle Colón";
        }else if (tiempo == servidorSemaforoCalleCólon.getProxCambioDeSemaforoAAmarillo()) {
            return "Cambio de Semaforo a Amarillo Calle Colón";
        }else if (tiempo == servidorSemaforoCalleCólon.getProxCambioDeSemaforoARojo()) {
            return "Cambio de Semaforo a Rojo Calle Colón";
        }else if (tiempo == servidorSemaforoCalleUrquiza.getProxCambioDeSemaforoAVerde()) {
            return "Cambio de Semaforo a Verde Calle Urquiza";
        }else if (tiempo == servidorSemaforoCalleCólon.getProxCambioDeSemaforoAAmarillo()) {
            return "Cambio de Semaforo a Amarillo Calle Urquiza";
        }else if (tiempo == servidorSemaforoCalleCólon.getProxCambioDeSemaforoARojo()) {
            return "Cambio de Semaforo a Rojo Calle Urquiza";
        }else if (tiempo == llegadaDeAutoCalleColón.getProxLlegadaAuto()) {
            return "Llegada Auto Calle Colón";
        } else if (tiempo == llegadaDeAutoCalleUrquiza.getProxLlegadaAuto()) {
            return "Llegada Auto Calle Urquiza";
        }else if (tiempo == cruceDeInterseccionCalleColón.getProxCruce()) {
            return "Cruce De Interseccion Calle Colón";
        } else /*(tiempo == cruceDeInterseccionCalleUrquiza.getProxCruce())*/
        {
            return "Cruce De Interseccion Calle Urquiza";
        }
    }


    public void cargarFila()
    {
        String  diaContent=String.valueOf(getDia());
        String  relojContent= Reloj.tiempoString();
        String  eventContent= getEventoActual().getNombre();
        String  autoContent= "0";
        String  rnd1Content=Double.toString(llegadaDeAutoCalleColón.getRandomLlegada());
        String  tiempoEntreLlegadasCalleColónContent=Double.toString(llegadaDeAutoCalleColón.getTiempoLlegada());
        String  proxAutoCalleColónContent=Double.toString(llegadaDeAutoCalleColón.getProxLlegadaAuto());
        String  autoCalleColónContent=Integer.toString(llegadaDeAutoCalleColón.getAuto().getNumero());
        String  estadoSemaforoCalleColónContent=servidorSemaforoCalleCólon.getEstadoSemaforo().getName();
        String  rndCruceCalleColónContent=Double.toString(cruceDeInterseccionCalleColón.getRandomCruce()) ;
        String  tiempoDeCruceCalleColónContent=Double.toString(cruceDeInterseccionCalleColón.getTiempoCruce());
        String  proxCruceCalleColónContent=Double.toString(cruceDeInterseccionCalleColón.getProxCruce());
        String  colaSemaforoCalleColónContent=Integer.toString(servidorSemaforoCalleCólon.getCola().size());
        String  rnd2Content=Double.toString(llegadaDeAutoCalleUrquiza.getRandomLlegada());;
        String  tiempoEntreLlegadasCalleUrquizaContent=Double.toString(llegadaDeAutoCalleUrquiza.getTiempoLlegada());
        String  proxAutoCalleUrquizaContent=Double.toString(llegadaDeAutoCalleUrquiza.getProxLlegadaAuto());;
        String  autoCalleUrquizaContent=Integer.toString(llegadaDeAutoCalleUrquiza.getAuto().getNumero());
        String  estadoSemaforoCalleUrquizaContent=servidorSemaforoCalleUrquiza.getEstadoSemaforo().getName();
        String  rndCruceCalleUrquizaContent=Double.toString(cruceDeInterseccionCalleUrquiza.getRandomCruce());
        String  tiempoDeCruceCalleUrquizaContent=Double.toString(cruceDeInterseccionCalleUrquiza.getTiempoCruce());
        String  proxCruceCalleUrquizaContent=Double.toString(cruceDeInterseccionCalleUrquiza.getProxCruce());
        String  colaSemaforoCalleUrquizaContent=Integer.toString(servidorSemaforoCalleUrquiza.getCola().size());

        data.add (new Fila(diaContent, relojContent,eventContent,autoContent,rnd1Content,tiempoEntreLlegadasCalleColónContent,
                proxAutoCalleColónContent,autoCalleColónContent,estadoSemaforoCalleColónContent,rndCruceCalleColónContent,
                tiempoDeCruceCalleColónContent,proxCruceCalleColónContent,colaSemaforoCalleColónContent,rnd2Content,
                tiempoEntreLlegadasCalleUrquizaContent,proxAutoCalleUrquizaContent,autoCalleUrquizaContent,estadoSemaforoCalleUrquizaContent,
                rndCruceCalleUrquizaContent,tiempoDeCruceCalleUrquizaContent,proxCruceCalleUrquizaContent,colaSemaforoCalleUrquizaContent));
    }
    public int getCantAutosCruzados() {
        return cantAutosCruzados;
    }

    public void setCantAutosCruzados(int cantAutosCruzados) {
        this.cantAutosCruzados = cantAutosCruzados;
    }

    public double getTiempoPermanencia() {
        return tiempoPermanencia;
    }

    public void setTiempoPermanencia(double tiempoPermanencia) {
        this.tiempoPermanencia = tiempoPermanencia;
    }

    public ObservableList<Fila> getData() {
        return data;
    }

    public void setData(ObservableList<Fila> data) {
        this.data = data;
    }

    public ArrayList<String> getConjuntoEventos() {
        return conjuntoEventos;
    }

    public void setConjuntoEventos(ArrayList<String> conjuntoEventos) {
        this.conjuntoEventos = conjuntoEventos;
    }

    public  Evento getEventoActual() {
        return eventoActual;
    }

    public  void setEventoActual(Evento eventoActual) {
        Gestor.eventoActual = eventoActual;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDiaDesde() {
        return diaDesde;
    }

    public void setDiaDesde(int diaDesde) {
        this.diaDesde = diaDesde;
    }

    public int getDiaHasta() {
        return diaHasta;
    }

    public void setDiaHasta(int diaHasta) {
        this.diaHasta = diaHasta;
    }

    public SemaforoCalleUrquiza getServidorSemaforoCalleUrquiza() {
        return servidorSemaforoCalleUrquiza;
    }

    public void setServidorSemaforoCalleUrquiza(SemaforoCalleUrquiza servidorSemaforoCalleUrquiza) {
        this.servidorSemaforoCalleUrquiza = servidorSemaforoCalleUrquiza;
    }

    public SemaforoCalleColón getServidorSemaforoCalleCólon() {
        return servidorSemaforoCalleCólon;
    }

    public void setServidorSemaforoCalleCólon(SemaforoCalleColón servidorSemaforoCalleCólon) {
        this.servidorSemaforoCalleCólon = servidorSemaforoCalleCólon;
    }

    public LlegadaDeAutoCalleUrquiza getLlegadaDeAutoCalleUrquiza() {
        return llegadaDeAutoCalleUrquiza;
    }

    public void setLlegadaDeAutoCalleUrquiza(LlegadaDeAutoCalleUrquiza llegadaDeAutoCalleUrquiza) {
        this.llegadaDeAutoCalleUrquiza = llegadaDeAutoCalleUrquiza;
    }

    public LlegadaDeAutoCalleColón getLlegadaDeAutoCalleColón() {
        return llegadaDeAutoCalleColón;
    }

    public void setLlegadaDeAutoCalleColón(LlegadaDeAutoCalleColón llegadaDeAutoCalleColón) {
        this.llegadaDeAutoCalleColón = llegadaDeAutoCalleColón;
    }

}
