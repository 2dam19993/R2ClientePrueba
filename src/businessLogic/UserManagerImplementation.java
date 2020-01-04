/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package businessLogic;


import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import service.UserRESTClient;
import transferObjects.UserBean;

/**
 *
 * @author Usuario
 */
public class UserManagerImplementation implements UserManager {
    private UserRESTClient webClient;
    private static final Logger LOGGER = Logger.getLogger("BusinessLogic.UserManagerImplementation");
    
    public UserManagerImplementation() {
        webClient= new UserRESTClient();
    }
    
    @Override
    public void createUser(UserBean user) throws BusinessLogic{
        try{
            webClient.createUser(user);
        }catch(Exception e){
            LOGGER.severe("ERROR! UserManagerImpl -> CreateUser: "+e.getMessage());
            throw new BusinessLogic(e.getMessage());
        }
        
    }
    @Override
    public void updateUser(UserBean user) throws BusinessLogic{
        try{
            webClient.updateUser(user);
        }catch(Exception e){
            LOGGER.severe("ERROR! UserManagerImpl -> updateUser: "+e.getMessage());
            throw new BusinessLogic(e.getMessage());
        }
        
    }
    @Override
    public UserBean iniciarSesion(String login,String contrasenia)throws BusinessLogic{
        UserBean elUsuario=null;
        try{
            elUsuario=webClient.iniciarSesion(UserBean.class, login, contrasenia);
        }catch(Exception e){
            LOGGER.severe("ERROR! UserManagerImpl -> iniciarSesion: "+e.getMessage());
            throw new BusinessLogic(e.getMessage());
        }
        return elUsuario;
    }
}
