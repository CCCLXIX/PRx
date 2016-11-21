package sample.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by ashleychen on 11/21/16.
 */
public class Profile {
    public  void display() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/view/Profile.fxml"));
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Login");
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
}
