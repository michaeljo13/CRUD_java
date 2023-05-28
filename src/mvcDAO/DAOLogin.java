/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcDAO;

//import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import mvcKoneksi.KoneksiDB;
import mvcModel.Login;

/**
 *
 * @author micha
 */
public class DAOLogin implements IDAOLogin{
    
    public DAOLogin(){
        con = KoneksiDB.getConnection();
    }
    
    @Override
    public void getByUsername(Login USERNAME) {
        PreparedStatement st = null;
        try{
            st = con.prepareStatement(strLogin);
            //st.setString(1, "%"+USERNAME+"%");
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Login mod_login = new Login();
                st.setString(1, mod_login.getUSERNAME());
                st.setString(2, mod_login.getPASSWORD());
                st.setString(3, mod_login.getID_ADMIN());
            }
        } catch (SQLException e){
            System.out.println("Gagal Login");
        }
        finally{
            try {
                st.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Login");
            }
        }
    }
    
    Connection con;
    //SQL query
    String strLogin = "select * from admin where USERNAME = ? and PASSWORD = ?;";

    

}
