/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import service.ClienteRESTClient;
import transferObjects.ClienteBean;

/**
 *
 * @author Usuario
 */
public class ClienteManagerImplementation implements ClienteManager {
    private ClienteRESTClient webClient;
    private static final Logger LOGGER = Logger.getLogger("BusinessLogic.ClienteManagerImplementation");
    
    public ClienteManagerImplementation() {
        webClient= new ClienteRESTClient();
    }
    @Override
    public void create(ClienteBean cliente) throws BusinessLogic {
        try{
            webClient.create(cliente);
        }catch(Exception e){
            LOGGER.severe("ERROR! UserManagerImpl -> CreateUser: "+e.getMessage());
            throw new BusinessLogic(e.getMessage());
        }
    }

    @Override
    public void edit(ClienteBean cliente) throws BusinessLogic {
        try{
            webClient.edit(cliente);
        }catch(Exception e){
            LOGGER.severe("ERROR! UserManagerImpl -> CreateUser: "+e.getMessage());
            throw new BusinessLogic(e.getMessage());
        }
    }

    @Override
    public void remove(Integer id) throws BusinessLogic {
        try{
           webClient.remove(id.toString());
        }catch(Exception e){
            LOGGER.severe("ERROR! UserManagerImpl -> CreateUser: "+e.getMessage());
            throw new BusinessLogic(e.getMessage());
        }
    }

    @Override
    public ClienteBean find(Integer id) throws BusinessLogic {
        ClienteBean resultado=null;
        try{
            resultado=webClient.find(ClienteBean.class, id.toString());
        }catch(Exception e){
            LOGGER.severe("ERROR! UserManagerImpl -> iniciarSesion: "+e.getMessage());
            throw new BusinessLogic(e.getMessage());
        }
        return resultado;
    }

    @Override
    public Set<ClienteBean> findAll() throws BusinessLogic {
        Set<ClienteBean> resultado=null;
        try{
           resultado=webClient.findAll(new GenericType<Set<ClienteBean>>() {});
        }catch(Exception e){
            LOGGER.severe("ERROR! UserManagerImpl -> iniciarSesion: "+e.getMessage());
            throw new BusinessLogic(e.getMessage());
        }
        return resultado;
    }

    @Override
    public List<ClienteBean> getVotantesId(Integer id) throws BusinessLogic {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarContrasenia(ClienteBean cliente) throws BusinessLogic {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comprarApunte(ClienteBean cliente, Integer idApunte) throws BusinessLogic {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void passwordForgot(String login) throws BusinessLogic {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
