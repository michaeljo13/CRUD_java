/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcDAO;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mvcKoneksi.KoneksiDB;
import mvcModel.Anggota;

/**
 *
 * @author tiara
 */
public class DAOAnggota implements IDAOAnggota{
    
    public DAOAnggota()
    {
        con = (Connection) KoneksiDB.getConnection();
    }
    
    @Override
    public List<Anggota> getAll() {
     List<Anggota> lstAnggota = null;
        try{
            lstAnggota = new ArrayList<Anggota>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next()) {                
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getString("ID_MEMBER"));
                anggota.setNama(rs.getString("NAMA"));
                anggota.setNo_hp(rs.getString("NO_HP"));
                anggota.setEmail(rs.getString("EMAIL"));
                anggota.setAlamat(rs.getString("ALAMAT"));
                anggota.setTgl_registrasi(rs.getDate("TGL_REGISTRASI"));
                lstAnggota.add(anggota);
            }
        }
        catch(SQLException e){
            System.out.println("error"+e);
        }
        return lstAnggota;
    }

    @Override
    public void insert(Anggota anggota) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strInsert);
            statement.setString(1, anggota.getIdAnggota());
            statement.setString(2, anggota.getNama());
            statement.setString(3, anggota.getNo_hp());
            statement.setString(4, anggota.getEmail());
            statement.setString(5, anggota.getAlamat());
            statement.setDate(6, (new java.sql.Date(anggota.getTgl_registrasi().getTime())));
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Gagal membuat input");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal membuat input");
            }
        }
    }

    @Override
    public void update(Anggota anggota) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strUpdate);
            statement.setString(1,anggota.getNama());
            statement.setString(2,anggota.getNo_hp());
            statement.setString(3, anggota.getEmail());
            statement.setString(4, anggota.getAlamat());
            statement.setDate(5, (new java.sql.Date(anggota.getTgl_registrasi().getTime())));
            statement.setString(6, anggota.getIdAnggota());
            System.out.println("berhasil update");
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Gagal membuat update");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal membuat update");
            }
        }
    }

    @Override
    public void delete(String idAnggota) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strDelete);
            statement.setString(1, idAnggota);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Gagal delete");
        }
        finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal delete");
            }
        }
    }

    @Override
    public List<Anggota> getAllByName(String nama) {
        List<Anggota> lstAnggota = null;
        try{
            lstAnggota = new ArrayList<Anggota>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+nama+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getString("ID_MEMBER"));
                anggota.setNama(rs.getString("NAMA"));
                anggota.setNo_hp(rs.getString("NO_HP"));
                anggota.setEmail(rs.getString("EMAIL"));
                anggota.setAlamat(rs.getString("ALAMAT"));
                anggota.setTgl_registrasi(rs.getDate("TGL_REGISTRASI"));
                lstAnggota.add(anggota);
            }
        }
        catch(SQLException e){
            System.out.println("error"+e);
        }
        return lstAnggota;
    }
    
    Connection con;
    //SQL query
    String strRead  = "select * from anggota;";
    String strInsert = "insert into anggota (ID_MEMBER, NAMA, NO_HP, EMAIL, ALAMAT, TGL_REGISTRASI) values (?,?,?,?,?,?);";
    String strUpdate = "update anggota set NAMA=?, NO_HP=?, EMAIL=?, ALAMAT=?, TGL_REGISTRASI=? where ID_MEMBER=? ;";
    String strDelete = "delete from anggota where ID_MEMBER = ?;";
    String strSearch = "select * from anggota where NAMA like ?;";
}
