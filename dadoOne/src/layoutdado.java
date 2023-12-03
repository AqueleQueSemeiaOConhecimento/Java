import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class layoutdado {

    @FXML
    private Button btnClick;

    @FXML
    private Label lblNumber;

    @FXML
    void evtCLick(ActionEvent event) {
        double num =  Math.random();
        num = num * 20;
        num = Math.floor(num);
        num++;
        lblNumber.setText(Double.toString(num));
        //lblNumber.setText("sopa");
        System.out.println(num);
    }

}

