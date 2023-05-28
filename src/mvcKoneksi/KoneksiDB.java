/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcKoneksi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
/**
 *
 * @author micha
 */
public class KoneksiDB {
    static Connection con;
    
    public static Connection getConnection()
    {
        if(con == null){
//            MysqlDataSource data = new MysqlDataSource();
//            data.setDatabaseName("db_library");
//            data.setUser("root");
//            data.setPassword("");
            
            try{
//                con = data.getConnection();
                String url = "jdbc:mysql://localhost:3306/db_library";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = (Connection) DriverManager.getConnection(url, user, pass);
                System.out.println("Berhasil terkoneksi");
            }catch(SQLException e)
            {
                System.out.println("Tidak terkoneksi");
            }
        }return con;
    }
}
