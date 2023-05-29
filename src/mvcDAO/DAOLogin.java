/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcDAO;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
import javax.swing.JOptionPane;
import mvcKoneksi.KoneksiDB;
import mvcModel.ModelLogin;
import mvcView.FormBuku;
import mvcView.FormLogin;

/**
 *
 * @author micha
 */
public class DAOLogin implements IDAOLogin {

    public DAOLogin() {
        con = KoneksiDB.getConnection();
    }

    private FormLogin frmLogin;

    public DAOLogin(FormLogin frmLogin) {
        this.frmLogin = frmLogin;
        System.out.println("asdfghj");

        con = KoneksiDB.getConnection();
    }

    @Override
    public void prosesLogin(ModelLogin mod_login) {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Menyiapkan pernyataan SQL
            String sql = "SELECT * FROM admin WHERE USERNAME = ? AND PASSWORD = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, mod_login.getUSERNAME());
            stmt.setString(2, mod_login.getPASSWORD());

            // Mengeksekusi pernyataan SQL
            rs = stmt.executeQuery();

            // Memeriksa apakah ada hasil dari query
            if (rs.next()) {
                // Login berhasil
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                System.out.println("Login berhasil!");

                // Panggil fungsi untuk beralih ke FormBuku
                FormBuku frmBuku = new FormBuku();
                frmBuku.setVisible(true);
                //FormLogin frmLogin = new FormLogin();
                System.out.println(frmLogin);
                frmLogin.dispose();
            } else {
                // Login gagal
                System.out.println("Login gagal!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Menutup objek ResultSet, PreparedStatement, dan Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

//    private void switchToFormBuku(){
//        FormBuku frmBuku = new FormBuku();
//        frmBuku.setVisible(true);
//        if(frmLogin != null){
//            frmLogin.dispose();
//        }
//    }
//    @Override
//    public List<ModelLogin> getByUsernameAndPassword(String USERNAME) {
//        List<ModelLogin> lstLogin = null;
//        //PreparedStatement st = null;
//        try{
//            lstLogin = new ArrayList<ModelLogin>();
//            Statement st = con.createStatement();
//            //st.setString(1, "%"+USERNAME+"%");
//            ResultSet rs = st.executeQuery(strLogin);
//            if(rs.next()){
//                ModelLogin mod_login = new ModelLogin();
//                mod_login.setUSERNAME(rs.getString("USERNAME"));
//                mod_login.setPASSWORD(rs.getString("PASSWORD"));
//                //mod_login.setID_ADMIN(rs.getString("ID_ADMIN"));
//                //st.setString(3, mod_login.getID_ADMIN());
//                lstLogin.add(mod_login);
//                
//                FormLogin frmLogin = new FormLogin();
//                frmLogin.dispose();
//                FormBuku frmBuku = new FormBuku();
//                frmBuku.setVisible(true);
//            }else{
//                JOptionPane.showMessageDialog(null, "MWEHEHE");
//            }
//        } catch (SQLException e){
//            System.out.println("Gagal Login"+e);
//        }
//        return lstLogin;
//    }
//    @Override
//    public void getByUsername(Login mod_login) {
//        PreparedStatement st = null;
//        try{
//            st = con.prepareStatement(strLogin);
//            //st.setString(1, "%"+USERNAME+"%");
//            ResultSet rs = st.executeQuery();
//            while(rs.next()){
//                //Login mod_login = new Login();
//                st.setString(1, mod_login.getUSERNAME());
//                st.setString(2, mod_login.getPASSWORD());
//                //st.setString(3, mod_login.getID_ADMIN());
//                
//                FormBuku frmBuku = new FormBuku();
//                frmBuku.setVisible(true);
//                FormLogin frmLogin = new FormLogin();
//                frmLogin.dispose();
//            }
//        } catch (SQLException e){
//            System.out.println("Gagal Login");
//        }
//        finally{
//            try {
//                st.close();
//            } catch (SQLException ex) {
//                System.out.println("Gagal Login");
//            }
//        }
//    }
    Connection con;
//    private FormLogin frmLogin;
//    ModelLogin mod_login = new ModelLogin();
//    //SQL query
//    String strLogin = "select * from admin where USERNAME='" + frmLogin.gettxtUsername().getText() +
//            "' and PASSWORD ='" + frmLogin.gettxtPassword().getText() + "'";

}
