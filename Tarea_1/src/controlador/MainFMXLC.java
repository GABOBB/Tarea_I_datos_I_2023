package controlador;

import data_structures.L_D_E;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import modelos.Persona;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class MainFMXLC implements Initializable {
    
    private L_D_E listaPersonas;

    ObservableList<Persona> personas = FXCollections.observableArrayList();
    
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
    private ComboBox<Persona> remplazar;
    @FXML
    private TextField new_edge;
    @FXML
    private ComboBox<String> new_P;
    @FXML
    private TextField new_name;
    @FXML
    private ComboBox<Persona> operando1;
    @FXML
    private ComboBox<Persona> operando2;
    @FXML
    private Text error_txt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.listaPersonas = new L_D_E();
            ObservableList<String> provincias = FXCollections.observableArrayList("San Jose",
                                                                                "Cartago",
                                                                                "Heredia",
                                                                                "Alajuela",
                                                                                "Puntarenas",
                                                                                "Guanacaste",
                                                                                "Limon");
        this.new_P.setItems(provincias);
        
        this.operando1.setItems(personas);
        this.operando2.setItems(personas);
        this.remplazar.setItems(personas);
    }    

    @FXML
    private void add_edad(ActionEvent event) {
        try{
            Persona op1 = operando1.getSelectionModel().getSelectedItem();
            Persona op2 = operando2.getSelectionModel().getSelectedItem();

            int resultado = op1.getEdad() + op2.getEdad();

            this.Rst.setText(resultado+"");
        }catch(Exception e){
            error_txt.setText("error en los datos");
        }
    }

    @FXML
    private void minus_edad(ActionEvent event) {
        try{
            Persona op1 = operando1.getSelectionModel().getSelectedItem();
            Persona op2 = operando2.getSelectionModel().getSelectedItem();

            int resultado = op1.getEdad() - op2.getEdad();

            this.Rst.setText(resultado+"");
        }catch(Exception e){
            error_txt.setText("error en los datos");
        }
    }

    @FXML
    private void mutl_edad(ActionEvent event) {
        try{
            Persona op1 = operando1.getSelectionModel().getSelectedItem();
            Persona op2 = operando2.getSelectionModel().getSelectedItem();

            int resultado = op1.getEdad() * op2.getEdad();

            this.Rst.setText(resultado+"");
        }catch(Exception e){
            error_txt.setText("error en los datos");
        }
    }

    @FXML
    private void div_edad(ActionEvent event) {
        try{
            Persona op1 = operando1.getSelectionModel().getSelectedItem();
            Persona op2 = operando2.getSelectionModel().getSelectedItem();
            if(op2.getEdad() == 0){
                this.Rst.setText("indefinido <divicion por 0>");
            }else{
                int resultado = op1.getEdad() / op2.getEdad();

                this.Rst.setText(resultado+"");
            }
        }catch(Exception e){
            error_txt.setText("error en los datos");
        }
    }

    @FXML
    private void add_Persona(ActionEvent event){
        if(listaPersonas.getSize()<4){
            int num; String name;
            try{
                name = this.new_name.getText();
                num = 1/name.length();
                num = parseInt(this.new_edge.getText());
                error_txt.setText("");
                Persona N_Per = new Persona(num, name, new_P.getSelectionModel().getSelectedItem().toString());
                this.listaPersonas.add_N(N_Per);
                this.personas.add(N_Per);
            }catch(Exception E){ error_txt.setText("error en los datos"); }
        }else{
            this.error_txt.setText("ya se supero la cantidad maxima de personas");
            this.remplazar.setVisible(true);
        }
      
    }

    @FXML
    private void Remplazar_P(ActionEvent event) {
        error_txt.setText("");
    }

    
}
