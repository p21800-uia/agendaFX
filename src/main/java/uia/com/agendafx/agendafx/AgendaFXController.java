package uia.com.agendafx.agendafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class AgendaFXController implements Initializable {

    @FXML private TableView<Contacto> table;
    @FXML private TableColumn<Contacto, String> tipo;
    @FXML private TableColumn<Contacto, String> nombre;
    @FXML private TableColumn<Contacto, String> fechaRecordatorio;
    @FXML private TableColumn<Contacto, String> fecha;
    @FXML
    private Label tipoLabel;
    @FXML
    private Label nombreLabel;
    @FXML
    private Label fechaLabel;
    @FXML
    private Label fechaRecordatorioLabel;

    public ObservableList<Contacto> list = FXCollections.observableArrayList(
            new Contacto("1", "Nava", "nava", "2"),
            new Contacto("2",  "Fahim", "fahim", "9"),
            new Contacto("3",  "Shariful", "Islam", "25")
    );

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        tipo.setCellValueFactory(new PropertyValueFactory<Contacto, String>("tipo"));
        nombre.setCellValueFactory(new PropertyValueFactory<Contacto, String>("nombre"));
        fechaRecordatorio.setCellValueFactory(new PropertyValueFactory<Contacto, String>("fechaRecordatorio"));
        fecha.setCellValueFactory(new PropertyValueFactory<Contacto, String>("fecha"));
        table.setItems(list);

        // Clear person details.
        showContactoDetails(null);

        // Listen for selection changes and show the person details when changed.
        table.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showContactoDetails(newValue));
    }


    private void showContactoDetails(Contacto contacto) {
        if (contacto != null) {
            // Fill the labels with info from the contacto object.
            tipoLabel.setText(contacto.getTipo());
            nombreLabel.setText(contacto.getNombre());
            fechaRecordatorioLabel.setText(contacto.getFechaRecordatorio());
            fechaLabel.setText(contacto.getFecha());
        } else {
            // Contacto is null, remove all the text.
            tipoLabel.setText("");
            nombreLabel.setText("");
            fechaRecordatorioLabel.setText("");
            fechaLabel.setText("");
        }
    }





}