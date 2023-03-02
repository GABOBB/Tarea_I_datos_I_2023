/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import data_structures.L_D_E;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class MainFMXLC implements Initializable {
    
    L_D_E listaPersonas = new L_D_E();

    @FXML
    private Text Rst;
    @FXML
    private Button add_e;
    @FXML
    private Button minus_e;
    @FXML
    private Button mult_e;
    @FXML
    private Button div_e;
    @FXML
    private Button add_N_P;
    @FXML
    private ComboBox<?> remplazar;
    @FXML
    private TextField new_edge;
    @FXML
    private ComboBox<?> new_P;
    @FXML
    private TextField new_name;
    @FXML
    private ComboBox<?> operando1;
    @FXML
    private ComboBox<?> operando2;
    @FXML
    private Text error_txt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void add_edad(ActionEvent event) {
    }

    @FXML
    private void minus_edad(ActionEvent event) {
    }

    @FXML
    private void mutl_edad(ActionEvent event) {
    }

    @FXML
    private void div_edad(ActionEvent event) {
        
    }

    @FXML
    private void add_Persona(ActionEvent event){
        if(listaPersonas.getSize()<=4){
            int edge; String name;
            try{
                name = this.new_name.getText();
                edge = 1/name.length();
                edge = parseInt(this.new_edge.getText());
            }catch(Exception E){ error_txt.setText("error en los datos"); }
        }else{
            this.error_txt.setText("ya se supero la cantidad maxima de personas");
            this.remplazar.setVisible(true);
        }
      
    }

    @FXML
    private void Remplazar_P(ActionEvent event) {
    }

    
}
