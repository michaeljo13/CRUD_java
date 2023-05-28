/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcController;

import mvcView.FormBuku;
import javax.swing.JOptionPane;
import mvcModel.Login;
import mvcDAO.DAOLogin;
import mvcDAO.IDAOLogin;
import mvcView.FormLogin;

/**
 *
 * @author micha
 */
public class ControllerLogin {
    
    //public static boolean tutup = false;
    
    public ControllerLogin(FormLogin frmLogin){
        this.frmLogin = frmLogin;
        iLogin = new DAOLogin();
    }
    
    public void login(){
        if(validasiInput() == true){
            Login mod_login = new Login();
            mod_login.setUSERNAME(frmLogin.gettxtUsername().getText());
            mod_login.setPASSWORD(frmLogin.gettxtPassword().getPassword().toString());
            iLogin.getByUsername(mod_login);
            //frmLogin.tutup = true;
            FormBuku frmBuku = new FormBuku();
            frmBuku.setVisible(true);
            frmLogin.dispose();
        }
    }
    
    public boolean validasiInput(){
        boolean valid = false;
        if(frmLogin.gettxtUsername().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }else if (frmLogin.gettxtPassword().getPassword().toString().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }
    
    FormLogin frmLogin;
    IDAOLogin iLogin;
}
