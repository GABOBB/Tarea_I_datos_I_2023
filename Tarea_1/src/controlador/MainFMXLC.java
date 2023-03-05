package controlador;

import data_structures.L_D_E;
import data_structures.N_D_E;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import modelos.Persona;

/**
 * FXML Controller class
 *
 * @author Gabriel
 * esta clase se encarga de ser el puente entre la interfas grafica y las estructuras de datos.
 */
public class MainFMXLC implements Initializable {
    
    private L_D_E listaPersonas;

    ObservableList<String> Nombres = FXCollections.observableArrayList();
    
    @FXML
    private Text Rst;//es el texto que se usa para poner la respuesta
    @FXML
    private Button add_e;//es el boton para hacer la suma
    @FXML
    private Button minus_e;//es el boton para hacer la resta
    @FXML
    private Button mult_e;//es el boton para hacer la multiplicacion
    @FXML
    private Button div_e;//es el boton para hacer la divicion
    @FXML
    private Button add_N_P;//es el boton para cargar una persona nueva
    @FXML
    private TextField new_edge;//es el espacio para introdicir la edad de la nueva persona
    @FXML
    private ComboBox<String> new_P;//es el espacio para seleccionar la provincia de la nueva persona
    @FXML
    private TextField new_name;//es el espaciop para introducir el nombre de la nueva persona
    @FXML
    private ComboBox<String> operando1;//es el espacio para seleccionar el primer modela para hacer las operaciones
    @FXML
    private ComboBox<String> operando2;//es el espacio para seleccionar el segundo modela para hacer las operaciones
    @FXML
    private Text error_txt;//es una etiqueta para mostrar cuando hay un error 

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     * inicializa la lista deblemente enlasada y los obserbablelist para los combobox
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.listaPersonas = new L_D_E();//incializa de manera vacia la lista de los modelos persona
            ObservableList<String> provincias = FXCollections.observableArrayList("San Jose",//inicializa el obserbable list con las provincias
                                                                                "Cartago",
                                                                                "Heredia",
                                                                                "Alajuela",
                                                                                "Puntarenas",
                                                                                "Guanacaste",
                                                                                "Limon");
        this.new_P.setItems(provincias);//setea el obserbable list con las provincias para poder serleccionarlas
        
        this.operando1.setItems(Nombres);//setea el obserbable list con los nombres para poder seleccionarlos 
        this.operando2.setItems(Nombres);//setea el obserbable list con los nombres para poder seleccionarlos 
        
        
    }    
    /**
     * este metodo se encarga de obtener los operandos seleccionados y pedir a la lista los modelos para sumar las edades
     * @param event 
     */
    @FXML
    private void add_edad(ActionEvent event) {
        Persona per1;//genera el espacio en memorai para un modelo persona temporal
        Persona per2;//genera el espacio en memorai para un modelo persona temporal
        try{
            String op1 = operando1.getSelectionModel().getSelectedItem();//colecta el nombre del operando uno
            String op2 = operando2.getSelectionModel().getSelectedItem();//colecta el nombre del operando dos
            if((per1 = this.listaPersonas.busca_Id(op1))!=null & (per2 = this.listaPersonas.busca_Id(op2))!=null){//revisa que los nodos con los opernados existan 
                
                int resultado = per1.getEdad() + per2.getEdad();//realiza la operacion matematica con las edades y la guarda

                this.Rst.setText(resultado+"");//escribe el resultado en el texto destinado para ello
            }else{this.Rst.setText("error");}//se ejecuta en caso de que no se encuentren los nodos o la operacion falle
        }catch(Exception e){
            error_txt.setText("error en los datos");//se emite el mensaje de error en caso de que algo falle
        }
    }
    /**
     * este metodo se encarga de obtener los operandos seleccionados y pedir a la lista los modelos para restar las edades
     * @param event 
     */
    @FXML
    private void minus_edad(ActionEvent event) {
        Persona per1;//genera el espacio en memorai para un modelo persona temporal
        Persona per2;//genera el espacio en memorai para un modelo persona temporal
        try{
            String op1 = operando1.getSelectionModel().getSelectedItem();//colecta el nombre del operando uno
            String op2 = operando2.getSelectionModel().getSelectedItem();//colecta el nombre del operando dos
            if((per1 = this.listaPersonas.busca_Id(op1))!=null && (per2 = this.listaPersonas.busca_Id(op2))!=null){//revisa que los nodos con los opernados existan 
            
                int resultado = per1.getEdad() - per2.getEdad();//realiza la operacion matematica con las edades y la guarda

                this.Rst.setText(resultado+"");//escribe el resultado en el texto destinado para ello
            }else{this.Rst.setText("error");}//se ejecuta en caso de que no se encuentren los nodos o la operacion falle
        }catch(Exception e){
            error_txt.setText("error en los datos");//se emite el mensaje de error en caso de que algo falle
        }
    }
    /**
     * este metodo se encarga de obtener los operandos seleccionados y pedir a la lista los modelos para multiplicar las edades
     * @param event 
     */
    @FXML
    private void mutl_edad(ActionEvent event) {
        Persona per1;//genera el espacio en memorai para un modelo persona temporal
        Persona per2;//genera el espacio en memorai para un modelo persona temporal
        try{
            String op1 = operando1.getSelectionModel().getSelectedItem();//colecta el nombre del operando uno
            String op2 = operando2.getSelectionModel().getSelectedItem();//colecta el nombre del operando dos
            if((per1 = this.listaPersonas.busca_Id(op1))!=null && (per2 = this.listaPersonas.busca_Id(op2))!=null){//revisa que los nodos con los opernados existan 
            
                int resultado = per1.getEdad() * per2.getEdad();//realiza la operacion matematica con las edades y la guarda

                this.Rst.setText(resultado+"");//escribe el resultado en el texto destinado para ello
            }else{this.Rst.setText("error");}//se ejecuta en caso de que no se encuentren los nodos o la operacion falle
        }catch(Exception e){
            error_txt.setText("error en los datos");//se emite el mensaje de error en caso de que algo falle
        }
    }
    /**
     * este metodo se encarga de obtener los operandos seleccionados y pedir a la lista los modelos para dividir las edades
     * @param event 
     */
    @FXML
    private void div_edad(ActionEvent event) {
        Persona per1;//genera el espcio en memoria para un modelo persona temporal
        Persona per2;//genera el espcio en memoria para un modelo persona temporal
        try{
            String op1 = operando1.getSelectionModel().getSelectedItem();//colecta el nombre del operando uno 
            String op2 = operando2.getSelectionModel().getSelectedItem();//colecta el nombre del operando dos
            if((per1 = this.listaPersonas.busca_Id(op1))!=null && (per2 = this.listaPersonas.busca_Id(op2))!=null){//revisa que los nodos con los opernados existan 
            
                int resultado = per1.getEdad() / per2.getEdad();//realiza la operacion matematica con las edades y la guarda

                this.Rst.setText(resultado+"");//escribe el resultado en el texto destinado para ello
            }else{this.Rst.setText("error");}//se ejecuta en caso de que no se encuentren los nodos o la operacion falle
        }catch(Exception e){
            error_txt.setText("error en los datos");//se emite el mensaje de error en caso de que algo falle
        }
    }
    /**
     * este metodo verifica que los datos introducidos sea apropiados y genera el modelo y lo añade a las listas
     * @param event 
     */
    @FXML
    private void add_Persona(ActionEvent event){
        int edad; String name; String Pro;//incializa las 3 varibles para generar el modelo persona
        this.error_txt.setText("");//limpia el texto de error 

        if(listaPersonas.getSize()<4){//verifica si la lista todavia no tiene su maximo de 4 elementos
            
            try{
                name = this.new_name.getText();//guarda el string que se coloco en la pocicion de nombre
                edad = parseInt(this.new_edge.getText());//guarda el intiger que se coloco en la pocicion de edad
                Pro = new_P.getSelectionModel().getSelectedItem();//guarda el string con la provincia seleccionada
                
            }catch(Exception E){error_txt.setText("error en los datos"); return;}//se ejecuta en el caso que los datos tengan errores
            
            if(name.length()==0 || this.listaPersonas.busca_Id(name)!= null){//verifica que el nombre no sea nulo y que no se repita
                error_txt.setText("introdusca un nombre valido"); return;//en caso de que no sea valido da el mensaje de error
            }
                
            if(edad < 1){//verifica que la edad sea mayor a 0
                error_txt.setText("la edad no es valida"); return;//en caso de que no sea valido da el mensaje de error
            }
            
            if(Pro == null){//verifica que se ecoja una provincia
                error_txt.setText("deve seleccionar la provincia"); return;//en caso de que no sea valido da el mensaje de error
            }
            
            Persona N_Per = new Persona(edad, name, Pro);//incializa el modelo persona con los datos verificados
            this.listaPersonas.add_N(N_Per);//a;ade el modelo persona a la lista 
            this.Nombres.add(N_Per.getID());//a;ade el nombre del modelo para poder buscarlo cuando se necesite
            
        }else{
            this.error_txt.setText("ya se supero la cantidad maxima de personas");//se ejecuta cunado la lista tiene mas de 4 nodos
        }
    }
}
