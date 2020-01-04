/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package transferObjects;

import java.io.Serializable;
import java.util.Date;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@XmlRootElement(name="user")
public class UserBean implements Serializable{
    private static final long serialVersionUID=1L;
    
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty login;
    private final SimpleStringProperty email;
    private final SimpleStringProperty nombreCompleto;
    private final SimpleObjectProperty<UserStatus> status;
    private final SimpleObjectProperty<UserPrivilege> privilegio;
    private final SimpleStringProperty contrasenia;
    private final SimpleObjectProperty<Date> ultimoAcceso;
    private final SimpleObjectProperty<Date> ultimoCambioContrasenia;

    public void setId(int id){
        this.id.set(id);
    }
    public void setStatus(UserStatus status){
        this.status.set(status);
    }
    public void setPrivilegio(UserPrivilege privilegio){
        this.privilegio.set(privilegio);
    }
    public void setLogin(String login){
        this.login.set(login);
    }
    public void setEmail(String email){
        this.email.set(email);
    }
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto.set(nombreCompleto);
    }
    public void setContrasenia(String contrasenia){
        this.contrasenia.set(contrasenia);
    }
    public void setUltimoAcceso(Date ultimoAcceso){
        this.ultimoAcceso.set(ultimoAcceso);
    }
    public void setUltimoCambioContrasenia(Date ultimoCambioContrasenia){
        this.ultimoCambioContrasenia.set(ultimoCambioContrasenia);
    }
    public int getId(){
        return id.get();
    }
    public String getLogin(){
        return login.get();
    }
    public String getEmail(){
        return email.get();
    }
    public String getNombreCompleto(){
        return nombreCompleto.get();
    }
    public String getContrasenia(){
        return contrasenia.get();
    }
    public UserStatus getStatus(){
        return status.get();
    }
    public UserPrivilege getPrivilegio(){
        return privilegio.get();
    }
    public Date getUltimoAcceso(){
        return ultimoAcceso.get();
    }
    public Date getUltimoCambioContrasenia(){
        return ultimoCambioContrasenia.get();
    }
    
    public UserBean(Integer id, String login, String email, String nombreCompleto, UserStatus status, UserPrivilege privilegio, String contrasenia, Date ultimoAcceso, Date ultimoCambioContrasenia) {
        this.id = new SimpleIntegerProperty(id);
        this.login = new SimpleStringProperty(login);
        this.email = new SimpleStringProperty(email);
        this.nombreCompleto = new SimpleStringProperty(nombreCompleto);
        this.status = new SimpleObjectProperty(status);
        this.privilegio = new SimpleObjectProperty(privilegio);
        this.contrasenia = new SimpleStringProperty(contrasenia);
        this.ultimoAcceso = new SimpleObjectProperty<Date>(ultimoAcceso);
        this.ultimoCambioContrasenia = new SimpleObjectProperty<Date>(ultimoCambioContrasenia);
    }
    
    
    
    
}
