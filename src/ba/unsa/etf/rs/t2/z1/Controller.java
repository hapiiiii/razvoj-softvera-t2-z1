package ba.unsa.etf.rs.t2.z1;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label poruka;

    public void sayHello(ActionEvent actionEvent) {
        poruka.setText("Hello World");  //crt+p sve sto treba pozvati
    }
}