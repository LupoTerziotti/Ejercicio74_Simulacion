package sample;

import Logica.Gestor;
import Logica.Reloj;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import util.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private ObservableList<Fila> data;
    private Gestor gestor;

    public Controller() {
        this.gestor = new Gestor();
        this.tvSim = new TableView<Fila>();
    }


    @FXML
    private Label txCamionesTotales;
    @FXML
    private Button btnsimular;
    @FXML
    private TextField txtDiaDesde;
    @FXML
    private TextField txtDiaHasta;
    @FXML
    private Label txAvgDurationService;
    @FXML
    private Label txCamionesNoAtendidos;
    @FXML
    private Label txCamionesXDia;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TableView<Fila> tvSim;
    @FXML
    private TableColumn<Fila, String> dia;
    @FXML
    private TableColumn<Fila, String> reloj;
    @FXML
    private TableColumn<Fila, String> event;
    @FXML
    private TableColumn<Fila, String> auto;
    @FXML
    private TableColumn<Fila, String> rnd1;
    @FXML
    private TableColumn<Fila, String> tiempoEntreLlegadasCalleColón;
    @FXML
    private TableColumn<Fila, String> proxAutoCalleColón;
    @FXML
    private TableColumn<Fila, String> autoCalleColón;
    @FXML
    private TableColumn<Fila, String> estadoSemaforoCalleColón;
    @FXML
    private TableColumn<Fila, String> rndCruceCalleColón;
    @FXML
    private TableColumn<Fila, String> tiempoDeCruceCalleColón;
    @FXML
    private TableColumn<Fila, String> proxCruceCalleColón;
    @FXML
    private TableColumn<Fila, String> colaSemaforoCalleColón;
    @FXML
    private TableColumn<Fila, String> rnd2;
    @FXML
    private TableColumn<Fila, String> tiempoEntreLlegadasCalleUrquiza;
    @FXML
    private TableColumn<Fila, String> proxAutoCalleUrquiza;
    @FXML
    private TableColumn<Fila, String> autoCalleUrquiza;
    @FXML
    private TableColumn<Fila, String> estadoSemaforoCalleUrquiza;
    @FXML
    private TableColumn<Fila, String> rndCruceCalleUrquiza;
    @FXML
    private TableColumn<Fila, String> tiempoDeCruceCalleUrquiza;
    @FXML
    private TableColumn<Fila, String> proxCruceCalleUrquiza;
    @FXML
    private TableColumn<Fila, String> colaSemaforoCalleUrquiza;
    @FXML


    public void cargarTabla() {

        this.gestor.inicio();

        this.setearColummnas();

        ObservableList<Fila> list = gestor.getData();

        tvSim.setItems(list);
    }

    public void setearColummnas() {
        dia.setCellValueFactory(new PropertyValueFactory<>("dia"));
        reloj.setCellValueFactory(new PropertyValueFactory<>("reloj"));
        event.setCellValueFactory(new PropertyValueFactory<>("event"));
        colaSemaforoCalleColón.setCellValueFactory(new PropertyValueFactory<>("colaSemaforoCalleColón"));
        rnd1.setCellValueFactory(new PropertyValueFactory<>("rnd1"));
        auto.setCellValueFactory(new PropertyValueFactory<>("auto"));
        tiempoEntreLlegadasCalleColón.setCellValueFactory(new PropertyValueFactory<>("tiempoEntreLlegadasCalleColón"));
        proxAutoCalleColón.setCellValueFactory(new PropertyValueFactory<>("proxAutoCalleColón"));
        autoCalleColón.setCellValueFactory(new PropertyValueFactory<>("autoCalleColón"));
        estadoSemaforoCalleColón.setCellValueFactory(new PropertyValueFactory<>("estadoSemaforoCalleColón"));
        rndCruceCalleColón.setCellValueFactory(new PropertyValueFactory<>("rndCruceCalleColón"));
        tiempoDeCruceCalleColón.setCellValueFactory(new PropertyValueFactory<>("tiempoDeCruceCalleColón"));
        proxCruceCalleColón.setCellValueFactory(new PropertyValueFactory<>("proxCruceCalleColón"));
        colaSemaforoCalleColón.setCellValueFactory(new PropertyValueFactory<>("colaSemaforoCalleColón"));
        rnd2.setCellValueFactory(new PropertyValueFactory<>("rnd2"));
        tiempoEntreLlegadasCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("tiempoEntreLlegadasCalleUrquiza"));
        autoCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("autoCalleUrquiza"));
        estadoSemaforoCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("estadoSemaforoCalleUrquiza"));
        rndCruceCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("rndCruceCalleUrquiza"));
        proxAutoCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("proxAutoCalleUrquiza"));
        tiempoDeCruceCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("tiempoDeCruceCalleUrquiza"));
        proxCruceCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("proxCruceCalleUrquiza"));
        proxAutoCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("proxAutoCalleUrquiza"));
        colaSemaforoCalleUrquiza.setCellValueFactory(new PropertyValueFactory<>("colaSemaforoCalleUrquiza"));
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    private void clearItemsInTableView() {
        tvSim.getItems().clear();
    }

    public void closeApp(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    private void setStats() {
//        txCamionesXDia.setText(gestor.promedioDeCamionesAtendidosPorDia());
//        txCamionesTotales.setText(gestor.cantidadDeCamionesTotales());
//        txCamionesNoAtendidos.setText(gestor.cantidadDeCamionesNoAtendidos());
//        txAvgDurationService.setText(gestor.promedioDeTiempoDePermanencia());

    }

    @FXML
    void simulacionOnAction(ActionEvent event) {

        this.initializeNewSimulation();//true porque es la simulacion comun
        this.setStats();
    }

    public void setearDias()
    {
        if (txtDiaDesde.getText() == null || txtDiaDesde.getText().trim().isEmpty()) {
            gestor.setDiaDesde(0);

        } else {
            gestor.setDiaDesde(Integer.valueOf(txtDiaDesde.getText()));
        }
        if (txtDiaHasta.getText() == null || txtDiaHasta.getText().trim().isEmpty()) {
            gestor.setDiaHasta(30);
        } else {
            gestor.setDiaHasta(Integer.valueOf(txtDiaHasta.getText()));
        }
    }





    private void initializeNewSimulation() {

        this.resetSimulation();
    }

    private void resetSimulation() {
        txAvgDurationService.setText("0");
        txCamionesNoAtendidos.setText("0");
        txCamionesTotales.setText("0");
        txCamionesXDia.setText("0");

        Reloj.resetearReloj();
        this.gestor = new Gestor();
        this.setearDias();
        clearItemsInTableView();
        cargarTabla();


    }
}
