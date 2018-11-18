package util;
import javafx.beans.property.SimpleStringProperty;

public class Fila {

    private final SimpleStringProperty dia;
    private final SimpleStringProperty reloj;
    private final SimpleStringProperty event;
    private final SimpleStringProperty auto;
    private final SimpleStringProperty rnd1;
    private final SimpleStringProperty tiempoEntreLlegadasCalleColón;
    private final SimpleStringProperty proxAutoCalleColón;
    private final SimpleStringProperty autoCalleColón;
    private final SimpleStringProperty estadoSemaforoCalleColón;
    private final SimpleStringProperty rndCruceCalleColón;
    private final SimpleStringProperty tiempoDeCruceCalleColón;
    private final SimpleStringProperty proxCruceCalleColón;
    private final SimpleStringProperty colaSemaforoCalleColón;
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
        this.tiempoEntreLlegadasCalleColón = new SimpleStringProperty(tiempoEntreLlegadasCalleColón);
        this.proxAutoCalleColón = new SimpleStringProperty(proxAutoCalleColón);
        this.autoCalleColón = new SimpleStringProperty(autoCalleColón);
        this.estadoSemaforoCalleColón = new SimpleStringProperty(estadoSemaforoCalleColón);
        this.rndCruceCalleColón = new SimpleStringProperty(rndCruceCalleColón);
        this.tiempoDeCruceCalleColón = new SimpleStringProperty(tiempoDeCruceCalleColón);
        this.proxCruceCalleColón = new SimpleStringProperty(proxCruceCalleColón);
        this.colaSemaforoCalleColón = new SimpleStringProperty(colaSemaforoCalleColón);
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

    public String getTiempoEntreLlegadasCalleColón() {
        return tiempoEntreLlegadasCalleColón.get();
    }

    public SimpleStringProperty tiempoEntreLlegadasCalleColónProperty() {
        return tiempoEntreLlegadasCalleColón;
    }

    public void setTiempoEntreLlegadasCalleColón(String tiempoEntreLlegadasCalleColón) {
        this.tiempoEntreLlegadasCalleColón.set(tiempoEntreLlegadasCalleColón);
    }

    public String getProxAutoCalleColón() {
        return proxAutoCalleColón.get();
    }

    public SimpleStringProperty proxAutoCalleColónProperty() {
        return proxAutoCalleColón;
    }

    public void setProxAutoCalleColón(String proxAutoCalleColón) {
        this.proxAutoCalleColón.set(proxAutoCalleColón);
    }

    public String getAutoCalleColón() {
        return autoCalleColón.get();
    }

    public SimpleStringProperty autoCalleColónProperty() {
        return autoCalleColón;
    }

    public void setAutoCalleColón(String autoCalleColón) {
        this.autoCalleColón.set(autoCalleColón);
    }

    public String getEstadoSemaforoCalleColón() {
        return estadoSemaforoCalleColón.get();
    }

    public SimpleStringProperty estadoSemaforoCalleColónProperty() {
        return estadoSemaforoCalleColón;
    }

    public void setEstadoSemaforoCalleColón(String estadoSemaforoCalleColón) {
        this.estadoSemaforoCalleColón.set(estadoSemaforoCalleColón);
    }

    public String getRndCruceCalleColón() {
        return rndCruceCalleColón.get();
    }

    public SimpleStringProperty rndCruceCalleColónProperty() {
        return rndCruceCalleColón;
    }

    public void setRndCruceCalleColón(String rndCruceCalleColón) {
        this.rndCruceCalleColón.set(rndCruceCalleColón);
    }

    public String getTiempoDeCruceCalleColón() {
        return tiempoDeCruceCalleColón.get();
    }

    public SimpleStringProperty tiempoDeCruceCalleColónProperty() {
        return tiempoDeCruceCalleColón;
    }

    public void setTiempoDeCruceCalleColón(String tiempoDeCruceCalleColón) {
        this.tiempoDeCruceCalleColón.set(tiempoDeCruceCalleColón);
    }

    public String getProxCruceCalleColón() {
        return proxCruceCalleColón.get();
    }

    public SimpleStringProperty proxCruceCalleColónProperty() {
        return proxCruceCalleColón;
    }

    public void setProxCruceCalleColón(String proxCruceCalleColón) {
        this.proxCruceCalleColón.set(proxCruceCalleColón);
    }

    public String getColaSemaforoCalleColón() {
        return colaSemaforoCalleColón.get();
    }

    public SimpleStringProperty colaSemaforoCalleColónProperty() {
        return colaSemaforoCalleColón;
    }

    public void setColaSemaforoCalleColón(String colaSemaforoCalleColón) {
        this.colaSemaforoCalleColón.set(colaSemaforoCalleColón);
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
