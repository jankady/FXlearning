package cz.kaduch.fxlearning;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn {

    @FXML
    private Button button;
    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
    @FXML
    private Label wrongLogIn;

    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();
    }

    public void checkLogin() throws IOException {
        Main m = new Main();
        if (username.getText().toString().equals("honzik") && password.getText().toString().equals("1234")) {
            wrongLogIn.setText("Success!");

            m.changeScene("afterLogIn.fxml");
        }
        else if (username.getText().isEmpty() || password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter data!");
        }
        else {
            wrongLogIn.setText("Wrong username or password");
        }
    }

}
