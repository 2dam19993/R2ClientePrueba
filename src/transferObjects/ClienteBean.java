/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObjects;

import java.io.Serializable;
import java.util.Date;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.collections.ObservableSet;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@XmlRootElement(name="cliente")
public class ClienteBean extends UserBean {
    private static final long serialVersionUID=1L;
    
    private final SimpleSetProperty<CompraBean> compras;
    private final SimpleSetProperty<ApunteBean> apuntes;
    private final SimpleSetProperty<ApunteBean> misVotaciones;
    private final SimpleFloatProperty saldo;
    private final SimpleObjectProperty<byte[]> foto;
    
    

    public ClienteBean(int id, String login, String email, String nombreCompleto, UserStatus status, UserPrivilege privilege, String contrasenia, Date ultimoAcceso, Date ultimoCambioContrasenia,ObservableSet compras, ObservableSet apuntes, ObservableSet misVotaciones,float saldo,byte[] foto) {
        super(id, login, email, nombreCompleto, status, privilege, contrasenia, ultimoAcceso, ultimoCambioContrasenia);
        this.compras=new SimpleSetProperty(compras);
        this.apuntes=new SimpleSetProperty(apuntes);
        this.misVotaciones=new SimpleSetProperty(misVotaciones);
        this.saldo=new SimpleFloatProperty(saldo);
        this.foto=new SimpleObjectProperty(foto);
    }

    /**
     * @return the compras
     */
    public ObservableSet<CompraBean> getCompras() {
        return compras.get();
    }

    /**
     * @param compras the compras to set
     */
    public void setCompras(ObservableSet<CompraBean> compras) {
        this.compras.set(compras);
    }

    /**
     * @return the apuntes
     */
    public ObservableSet<ApunteBean> getApuntes() {
        return apuntes.get();
    }

    /**
     * @param apuntes the apuntes to set
     */
    public void setApuntes(ObservableSet<ApunteBean> apuntes) {
        this.apuntes.set(apuntes);
    }

    /**
     * @return the misVotaciones
     */
    public ObservableSet<ApunteBean> getMisVotaciones() {
        return misVotaciones.get();
    }

    /**
     * @param misVotaciones the misVotaciones to set
     */
    public void setMisVotaciones(ObservableSet<ApunteBean> misVotaciones) {
        this.misVotaciones.set(misVotaciones);
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo.get();
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo.set(saldo);
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto.get();
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto.set(foto);
    }
    
    
}
