/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcController;

import java.util.List;
import mvcView.FormBuku;
import javax.swing.JOptionPane;
import mvcModel.ModelLogin;
import mvcDAO.DAOLogin;
import mvcDAO.IDAOLogin;
import mvcView.FormLogin;

/**
 *
 * @author micha
 */
public class ControllerLogin {

    //private String USERNAME;
    //public static boolean tutup = false;
    
    public ControllerLogin(IDAOLogin iLogin){
        this.iLogin = iLogin;
    }
    
    public void prosesLogin(String username, String password) {
        ModelLogin mod_login = new ModelLogin();
        mod_login.setUSERNAME(username);
        mod_login.setPASSWORD(password);

        iLogin.prosesLogin(mod_login);
    }
    
//    public void login(){
//        if(validasiInput() == true){
//            ModelLogin mod_login = new ModelLogin();
//            //mod_login.setUSERNAME(frmLogin.gettxtUsername().getText());
//            //mod_login.setPASSWORD(frmLogin.gettxtPassword().getText());
//            //lstLogin = iLogin.getByUsernameAndPassword(mod_login.setUSERNAME(USERNAME));
//            lstLogin = iLogin.getByUsernameAndPassword(USERNAME);
//            //iLogin.getByUsernameAndPassword(USERNAME);
//            //frmLogin.tutup = true;
//            //FormBuku frmBuku = new FormBuku();
//            //frmBuku.setVisible(true);
//            //frmLogin.dispose();
//            
//            
//        }
//    }
//    
//    public boolean validasiInput(){
//        boolean valid = false;
//        if(frmLogin.gettxtUsername().getText().trim().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
//            frmLogin.gettxtUsername().requestFocus();
//        }else if (frmLogin.gettxtPassword().getText().trim().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
//            frmLogin.gettxtPassword().requestFocus();
//        }else{
//            //Login mod_login = new Login();
//            //iLogin.getByUsernameAndPassword(mod_login);
//            valid = true;
//        }
//        return valid;
//    }
    
//    FormLogin frmLogin;
    private IDAOLogin iLogin;
//    List<ModelLogin> lstLogin;
}
