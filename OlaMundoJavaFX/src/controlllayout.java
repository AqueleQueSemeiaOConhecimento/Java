import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class controlllayout {

    @FXML
    private Button buttonClick;

    @FXML
    private Label lblMensage;

    @FXML
    void evtForAction(ActionEvent event) {
        lblMensage.setText("Vou te comer num uno, puta safada rsrs");
    
}}
