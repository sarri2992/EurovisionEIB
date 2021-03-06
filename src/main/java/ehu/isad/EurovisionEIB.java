/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ehu.isad;

import ehu.isad.controller.ui.HasieraKud;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EurovisionEIB extends Application {

    private Parent EurobisioaUI;

    private Stage stage;

    private HasieraKud hasieraKud;


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        pantailakKargatu();

        stage.setTitle("EUROVISION EIB");
        stage.setScene(new Scene(EurobisioaUI));
        stage.show();
    }

    private void pantailakKargatu() throws IOException {

        FXMLLoader loaderEurobisioa = new FXMLLoader(getClass().getResource("/hasiera.fxml"));
        EurobisioaUI = (Parent) loaderEurobisioa.load();
        hasieraKud = loaderEurobisioa.getController();
        hasieraKud.setMainApp(this);
    }
}
