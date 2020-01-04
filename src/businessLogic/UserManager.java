/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import transferObjects.UserBean;

/**
 *
 * @author Usuario
 */
public interface UserManager {
    public void createUser(UserBean user) throws BusinessLogic;
    public void updateUser(UserBean user) throws BusinessLogic;
    public UserBean iniciarSesion(String login,String contrasenia)throws BusinessLogic;
}
