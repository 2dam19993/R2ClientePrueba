/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import transferObjects.UserBean;
import static view.ControladorGeneral.showErrorAlert;

/**
 *
 * @author Usuario
 */
public class GestorDeApuntesFXController {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("view.GestorDeApuntesFXController");
    private UserBean user;
    private Stage stage;
    @FXML
    private TableView tableApuntes;
    @FXML
    private TableColumn clId;
    @FXML
    private TableColumn clTitulo;
    @FXML
    private TableColumn clDesc;
    @FXML
    private TableColumn clFechaValidacion;
    @FXML
    private TableColumn clLikes;
    @FXML
    private TableColumn clPrecio;
    @FXML
    private TableColumn clCreador;
    @FXML
    private TableColumn clVendidos;
    @FXML
    private TableColumn clMateria;
    @FXML
    private Button btnRefrescar;
    @FXML
    private Button btnCargarDatos;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnBorrar;
    @FXML
    private Button btnInforme;
    @FXML
    private TextField textFieldTitulo;
    @FXML
    private TextArea textFieldDesc;
    @FXML
    private DatePicker datePickerFecha;
    @FXML
    private ComboBox comboBoxMaterias;
    @FXML
    private Label labelTitulo;
    @FXML
    private Label labelDesc;
    @FXML
    private Label labelFecha;
    @FXML
    private Label labelMateria;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu menuCuenta;
    @FXML
    private MenuItem menuCuentaCerrarSesion;
    @FXML
    private MenuItem menuCuentaSalir;
    @FXML
    private Menu menuVentanas;
    @FXML
    private MenuItem menuVentanasGestorApuntes;
    @FXML
    private MenuItem menuVentanasGestorPacks;
    @FXML
    private MenuItem menuVentanasGestorOfertas;
    @FXML
    private MenuItem menuVentanasGestorMaterias;
    @FXML
    private Menu menuHelp;
    @FXML
    private MenuItem menuHelpAbout;
    @FXML
    public void initStage(Parent root) {
        try{
            LOGGER.info("Iniciando la ventana LogOut");
            Scene scene=new Scene(root);
            stage=new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.setTitle("Tienda de apuntes");
            stage.setResizable(true);
            stage.setMaximized(true);
            //Vamos a rellenar los datos en la ventana.
            stage.setOnShowing(this::handleWindowShowing);
            
            //Mnemonicos
            //Menu->
            menuCuenta.setMnemonicParsing(true);
            menuCuenta.setText("_Cuenta");
            menuVentanas.setMnemonicParsing(true);
            menuVentanas.setText("_Ventanas");
            menuHelp.setMnemonicParsing(true);
            menuHelp.setText("_Help");
            //<-Menu
            
            
            
            stage.show();
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
        
    }
    private void handleWindowShowing(WindowEvent event){
        try{
            LOGGER.info("handlWindowShowing --> LogOut");
            
            
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
    //Parte comun
    @FXML
    private void onActionCerrarSesion(ActionEvent event){
        try{
            //Creamos la alerta del tipo confirmación.
            Alert alertCerrarSesion = new Alert(Alert.AlertType.CONFIRMATION);
            //Ponemos titulo de la ventana como titulo para la alerta.
            alertCerrarSesion.setTitle("Cerrar sesión");
            alertCerrarSesion.setHeaderText("¿Quieres cerrar sesión?");
            //Si acepta se cerrara esta ventana.
            alertCerrarSesion.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    LOGGER.info("Cerrando sesión.");
                    stage.hide();
                }
            });
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
    @FXML
    private void onActionSalir(ActionEvent event){
        try{
            //Creamos la alerta con el tipo confirmación, con su texto y botones de
            //aceptar y cancelar.
            Alert alertCerrarAplicacion = new Alert(Alert.AlertType.CONFIRMATION,"Si sale de la aplicación cerrara\nautomáticamente la sesión.",ButtonType.NO,ButtonType.YES);
            //Añadimos titulo a la ventana como el alert.
            alertCerrarAplicacion.setTitle("Cerrar la aplicación");
            alertCerrarAplicacion.setHeaderText("¿Quieres salir de la aplicación?");
            //Si acepta cerrara la aplicación.
            alertCerrarAplicacion.showAndWait().ifPresent(response -> {
                if (response == ButtonType.YES) {
                    LOGGER.info("Cerrando la aplicación.");
                    Platform.exit();
                }
            });
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
    
    //Inicio de los metodos de navegación de la aplicación
    
    
    @FXML
    private void onActionAbout(ActionEvent event){
    }
    //Fin de los metodos de navegación de la aplicación
    
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}