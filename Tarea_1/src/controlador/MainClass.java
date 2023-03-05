package controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel
 * Esta clase es responsable por iniciar la ventana
 */
public class MainClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainClass.class.getResource("/visual/mainFMXL.fxml"));
            Pane ventana = (Pane) loader.load();//se carga la ventana
            Scene scene = new Scene(ventana);//se carga la escena
            primaryStage.setScene(scene);//se setea la escena
            primaryStage.show();//se ense;a la escena
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
