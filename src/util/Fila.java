package util;
import javafx.beans.property.SimpleStringProperty;

public class Fila {

    private final SimpleStringProperty dia;
    private final SimpleStringProperty reloj;
    private final SimpleStringProperty event;
    private final SimpleStringProperty auto;
    private final SimpleStringProperty rnd1;
    private final SimpleStringProperty tiempoEntreLlegadasCalleColon;
    private final SimpleStringProperty proxAutoCalleColon;
    private final SimpleStringProperty autoCalleColon;
    private final SimpleStringProperty estadoSemaforoCalleColon;
    private final SimpleStringProperty rndCruceCalleColon;
    private final SimpleStringProperty tiempoDeCruceCalleColon;
    private final SimpleStringProperty proxCruceCalleColon;
    private final SimpleStringProperty colaSemaforoCalleColon;
    private final SimpleStringProperty rnd2;
    private final SimpleStringProperty tiempoEntreLlegadasCalleUrquiza;
    private final SimpleStringProperty proxAutoCalleUrquiza;
    private final SimpleStringProperty autoCalleUrquiza;
    private final SimpleStringProperty estadoSemaforoCalleUrquiza;
    private final SimpleStringProperty rndCruceCalleUrquiza;
    private final SimpleStringProperty tiempoDeCruceCalleUrquiza;
    private final SimpleStringProperty proxCruceCalleUrquiza;
    private final SimpleStringProperty colaSemaforoCalleUrquiza;


    public String getDia() {
        return dia.get();
    }

    public SimpleStringProperty diaProperty() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia.set(dia);
    }

    public Fila(String dia, String reloj, String event, String auto, String rnd1, String tiempoEntreLlegadasCalleColón,
                String proxAutoCalleColón, String autoCalleColón, String estadoSemaforoCalleColón, String rndCruceCalleColón,
                String tiempoDeCruceCalleColón, String proxCruceCalleColón, String colaSemaforoCalleColón, String rnd2,
                String tiempoEntreLlegadasCalleUrquiza, String proxAutoCalleUrquiza, String autoCalleUrquiza,
                String tiempoAtencionBalanz, String rndCruceCalleUrquiza, String tiempoDeCruceCalleUrquiza,
                String proxCruceCalleUrquiza, String colaSemaforoCalleUrquiza) {
        this.dia= new SimpleStringProperty(dia);
        this.reloj = new SimpleStringProperty(reloj);
        this.event = new SimpleStringProperty(event);
        this.auto = new SimpleStringProperty(auto);
        this.rnd1 = new SimpleStringProperty(rnd1);
        this.tiempoEntreLlegadasCalleColon = new SimpleStringProperty(tiempoEntreLlegadasCalleColón);
        this.proxAutoCalleColon = new SimpleStringProperty(proxAutoCalleColón);
        this.autoCalleColon = new SimpleStringProperty(autoCalleColón);
        this.estadoSemaforoCalleColon = new SimpleStringProperty(estadoSemaforoCalleColón);
        this.rndCruceCalleColon = new SimpleStringProperty(rndCruceCalleColón);
        this.tiempoDeCruceCalleColon = new SimpleStringProperty(tiempoDeCruceCalleColón);
        this.proxCruceCalleColon = new SimpleStringProperty(proxCruceCalleColón);
        this.colaSemaforoCalleColon = new SimpleStringProperty(colaSemaforoCalleColón);
        this.rnd2 = new SimpleStringProperty(rnd2);
        this.tiempoEntreLlegadasCalleUrquiza = new SimpleStringProperty(tiempoEntreLlegadasCalleUrquiza);
        this.proxAutoCalleUrquiza = new SimpleStringProperty(proxAutoCalleUrquiza);
        this.autoCalleUrquiza = new SimpleStringProperty(autoCalleUrquiza);
        this.estadoSemaforoCalleUrquiza = new SimpleStringProperty(tiempoAtencionBalanz);
        this.rndCruceCalleUrquiza = new SimpleStringProperty(rndCruceCalleUrquiza);
        this.tiempoDeCruceCalleUrquiza = new SimpleStringProperty(tiempoDeCruceCalleUrquiza);
        this.proxCruceCalleUrquiza = new SimpleStringProperty(proxCruceCalleUrquiza);
        this.colaSemaforoCalleUrquiza = new SimpleStringProperty(colaSemaforoCalleUrquiza);
    }

    public String getReloj() {
        return reloj.get();
    }

    public SimpleStringProperty relojProperty() {
        return reloj;
    }

    public void setReloj(String reloj) {
        this.reloj.set(reloj);
    }

    public String getEvent() {
        return event.get();
    }

    public SimpleStringProperty eventProperty() {
        return event;
    }

    public void setEvent(String event) {
        this.event.set(event);
    }

    public String getAuto() {
        return auto.get();
    }

    public SimpleStringProperty autoProperty() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto.set(auto);
    }

    public String getRnd1() {
        return rnd1.get();
    }

    public SimpleStringProperty rnd1Property() {
        return rnd1;
    }

    public void setRnd1(String rnd1) {
        this.rnd1.set(rnd1);
    }

    public String getTiempoEntreLlegadasCalleColon() {
        return tiempoEntreLlegadasCalleColon.get();
    }

    public SimpleStringProperty tiempoEntreLlegadasCalleColónProperty() {
        return tiempoEntreLlegadasCalleColon;
    }

    public SimpleStringProperty tiempoEntreLlegadasCalleColonProperty() {
        return tiempoEntreLlegadasCalleColon;
    }

    public void setTiempoEntreLlegadasCalleColon(String tiempoEntreLlegadasCalleColon) {
        this.tiempoEntreLlegadasCalleColon.set(tiempoEntreLlegadasCalleColon);
    }

    public String getProxAutoCalleColon() {
        return proxAutoCalleColon.get();
    }

    public SimpleStringProperty proxAutoCalleColonProperty() {
        return proxAutoCalleColon;
    }

    public void setProxAutoCalleColon(String proxAutoCalleColon) {
        this.proxAutoCalleColon.set(proxAutoCalleColon);
    }

    public String getAutoCalleColon() {
        return autoCalleColon.get();
    }

    public SimpleStringProperty autoCalleColonProperty() {
        return autoCalleColon;
    }

    public void setAutoCalleColon(String autoCalleColon) {
        this.autoCalleColon.set(autoCalleColon);
    }

    public String getEstadoSemaforoCalleColon() {
        return estadoSemaforoCalleColon.get();
    }

    public SimpleStringProperty estadoSemaforoCalleColonProperty() {
        return estadoSemaforoCalleColon;
    }

    public void setEstadoSemaforoCalleColon(String estadoSemaforoCalleColon) {
        this.estadoSemaforoCalleColon.set(estadoSemaforoCalleColon);
    }

    public String getRndCruceCalleColon() {
        return rndCruceCalleColon.get();
    }

    public SimpleStringProperty rndCruceCalleColonProperty() {
        return rndCruceCalleColon;
    }

    public void setRndCruceCalleColon(String rndCruceCalleColon) {
        this.rndCruceCalleColon.set(rndCruceCalleColon);
    }

    public String getTiempoDeCruceCalleColon() {
        return tiempoDeCruceCalleColon.get();
    }

    public SimpleStringProperty tiempoDeCruceCalleColonProperty() {
        return tiempoDeCruceCalleColon;
    }

    public void setTiempoDeCruceCalleColon(String tiempoDeCruceCalleColon) {
        this.tiempoDeCruceCalleColon.set(tiempoDeCruceCalleColon);
    }

    public String getProxCruceCalleColon() {
        return proxCruceCalleColon.get();
    }

    public SimpleStringProperty proxCruceCalleColonProperty() {
        return proxCruceCalleColon;
    }

    public void setProxCruceCalleColon(String proxCruceCalleColon) {
        this.proxCruceCalleColon.set(proxCruceCalleColon);
    }

    public String getColaSemaforoCalleColon() {
        return colaSemaforoCalleColon.get();
    }

    public SimpleStringProperty colaSemaforoCalleColonProperty() {
        return colaSemaforoCalleColon;
    }

    public void setColaSemaforoCalleColon(String colaSemaforoCalleColon) {
        this.colaSemaforoCalleColon.set(colaSemaforoCalleColon);
    }

    public String getRnd2() {
        return rnd2.get();
    }

    public SimpleStringProperty rnd2Property() {
        return rnd2;
    }

    public void setRnd2(String rnd2) {
        this.rnd2.set(rnd2);
    }

    public String getTiempoEntreLlegadasCalleUrquiza() {
        return tiempoEntreLlegadasCalleUrquiza.get();
    }

    public SimpleStringProperty tiempoEntreLlegadasCalleUrquizaProperty() {
        return tiempoEntreLlegadasCalleUrquiza;
    }

    public void setTiempoEntreLlegadasCalleUrquiza(String tiempoEntreLlegadasCalleUrquiza) {
        this.tiempoEntreLlegadasCalleUrquiza.set(tiempoEntreLlegadasCalleUrquiza);
    }

    public String getProxAutoCalleUrquiza() {
        return proxAutoCalleUrquiza.get();
    }

    public SimpleStringProperty proxAutoCalleUrquizaProperty() {
        return proxAutoCalleUrquiza;
    }

    public void setProxAutoCalleUrquiza(String proxAutoCalleUrquiza) {
        this.proxAutoCalleUrquiza.set(proxAutoCalleUrquiza);
    }

    public String getAutoCalleUrquiza() {
        return autoCalleUrquiza.get();
    }

    public SimpleStringProperty autoCalleUrquizaProperty() {
        return autoCalleUrquiza;
    }

    public void setAutoCalleUrquiza(String autoCalleUrquiza) {
        this.autoCalleUrquiza.set(autoCalleUrquiza);
    }

    public String getEstadoSemaforoCalleUrquiza() {
        return estadoSemaforoCalleUrquiza.get();
    }

    public SimpleStringProperty estadoSemaforoCalleUrquizaProperty() {
        return estadoSemaforoCalleUrquiza;
    }

    public void setEstadoSemaforoCalleUrquiza(String estadoSemaforoCalleUrquiza) {
        this.estadoSemaforoCalleUrquiza.set(estadoSemaforoCalleUrquiza);
    }

    public String getRndCruceCalleUrquiza() {
        return rndCruceCalleUrquiza.get();
    }

    public SimpleStringProperty rndCruceCalleUrquizaProperty() {
        return rndCruceCalleUrquiza;
    }

    public void setRndCruceCalleUrquiza(String rndCruceCalleUrquiza) {
        this.rndCruceCalleUrquiza.set(rndCruceCalleUrquiza);
    }

    public String getTiempoDeCruceCalleUrquiza() {
        return tiempoDeCruceCalleUrquiza.get();
    }

    public SimpleStringProperty tiempoDeCruceCalleUrquizaProperty() {
        return tiempoDeCruceCalleUrquiza;
    }

    public void setTiempoDeCruceCalleUrquiza(String tiempoDeCruceCalleUrquiza) {
        this.tiempoDeCruceCalleUrquiza.set(tiempoDeCruceCalleUrquiza);
    }

    public String getProxCruceCalleUrquiza() {
        return proxCruceCalleUrquiza.get();
    }

    public SimpleStringProperty proxCruceCalleUrquizaProperty() {
        return proxCruceCalleUrquiza;
    }

    public void setProxCruceCalleUrquiza(String proxCruceCalleUrquiza) {
        this.proxCruceCalleUrquiza.set(proxCruceCalleUrquiza);
    }

    public String getColaSemaforoCalleUrquiza() {
        return colaSemaforoCalleUrquiza.get();
    }

    public SimpleStringProperty colaSemaforoCalleUrquizaProperty() {
        return colaSemaforoCalleUrquiza;
    }

    public void setColaSemaforoCalleUrquiza(String colaSemaforoCalleUrquiza) {
        this.colaSemaforoCalleUrquiza.set(colaSemaforoCalleUrquiza);
    }
}
