/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcKoneksi;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
/**
 *
 * @author micha
 */
public class KoneksiDB {
    static Connection con;
    
    public static Connection getConnection()
    {
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_library");
            data.setUser("root");
            data.setPassword("");
            
            try{
                con = data.getConnection();
                System.out.println("Berhasil terkoneksi");
            }catch(SQLException e)
            {
                System.out.println("Tidak terkoneksi");
            }
        }return con;
    }
}
 