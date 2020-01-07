/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import transferObjects.UserBean;
import static view.ControladorGeneral.showErrorAlert;

/**
 *
 * @author Usuario
 */
public class TiedaApuntesFXController {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("view.TiedaApuntesFXController");
    private UserBean user;
    private Stage stage;
    
    @FXML
    private Button btnRefrescar;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnComprar;
    @FXML
    private TextField textFieldBuscar;
    @FXML
    private ComboBox comboBoxOrdenar;
    @FXML
    private ListView listViewMateria;
    @FXML
    private ListView listViewApuntes;
    @FXML
    private Label labelMateria;
    @FXML
    private Label labelTitulo;
    
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
    private MenuItem menuVentanasMiBiblioteca;
    @FXML
    private MenuItem menuVentanasTiendaApuntes;
    @FXML
    private MenuItem menuVentanasTiendaPacks;
    @FXML
    private MenuItem menuVentanasMiPerfil;
    @FXML
    private MenuItem menuVentanasSubirApunte;
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
            stage.setTitle("Principal");
            stage.setResizable(true);
            stage.setMaximized(true);
            //Vamos a rellenar los datos en la ventana.
            stage.setOnShowing(this::handleWindowShowing);
            
            menuCuenta.setMnemonicParsing(true);
            menuCuenta.setText("_Cuenta");
            menuVentanas.setMnemonicParsing(true);
            menuVentanas.setText("_Ventanas");
            menuHelp.setMnemonicParsing(true);
            menuHelp.setText("_Help");
            
            //CARGAR MATERIAS
            //DEJARLO EN TODAS LAS MATERIAS
            
            //CARGAR LISTVIEW DE PAUNTES
            
            //CARGAR EL COMBO BOX
            //DEJARLO EN EL PRIMERO
            
            
            textFieldBuscar.setOnKeyPressed(this::keyPressBuscar);
            btnBuscar.setOnKeyPressed(this::keyPressBuscar);
            stage.show();
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
        
    }
    
    private void handleWindowShowing(WindowEvent event){
        try{
            LOGGER.info("handlWindowShowing --> LogOut");
            textFieldBuscar.requestFocus();
            
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
    
    
    @FXML
    private void onActionRefrescar(ActionEvent event){
        showErrorAlert("Has pulsado refrescar");
    }
    @FXML
    private void onActionBuscar(ActionEvent event){
        showErrorAlert("Has pulsado Buscar");
    }
    @FXML
    private void onActionComprar(ActionEvent event){
        showErrorAlert("Has pulsado Comprar");
    }
    @FXML
    private void onActionCerrarSesion(ActionEvent event){
        showErrorAlert("Has pulsado CerrarSesion");
    }
    @FXML
    private void onActionSalir(ActionEvent event){
        showErrorAlert("Has pulsado salir");
    }
    private void keyPressBuscar(KeyEvent key){
        if(key.getCode().equals(KeyCode.ENTER)) {
            btnBuscar.fire();
        }
        
    }
}
