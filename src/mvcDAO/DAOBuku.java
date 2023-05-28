/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcDAO;

//import mvcDAO.IDAOBuku;
import mvcKoneksi.KoneksiDB;
import mvcModel.Buku;
import java.util.List;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


/**
 *
 * @author micha
 */
public class DAOBuku implements IDAOBuku{
    
    public DAOBuku(){
        con = KoneksiDB.getConnection();
    }
    
    @Override
    public List<Buku> getAll() {
        List<Buku> lstBuku = null;
        try{
            lstBuku = new ArrayList<Buku>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next()) {                
                Buku book = new Buku();
                book.setIdBuku(rs.getString("ID_BUKU"));
                book.setJudul(rs.getString("TITLE"));
                book.setPenulis(rs.getString("AUTHOR"));
                book.setPenerbit(rs.getString("PUBLISHER"));
                book.setTahun(rs.getInt("YEAR"));
                lstBuku.add(book);
            }
        }
        catch(SQLException e){
            System.out.println("error"+e);
        }
        return lstBuku;
    }
    
    @Override
    public void insert(Buku book) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strInsert);
            statement.setString(1, book.getIdBuku());
            statement.setString(2, book.getJudul());
            statement.setString(3, book.getPenulis());
            statement.setString(4, book.getPenerbit());
            statement.setInt(5, book.getTahun());
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
    public void delete(String idBuku) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strDelete);
            statement.setString(1, idBuku);
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
    public void update(Buku book) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strUpdate);
            statement.setString(1, book.getJudul());
            statement.setString(2, book.getPenulis());
            statement.setString(3, book.getPenerbit());
            statement.setInt(4, book.getTahun());
            statement.setString(5, book.getIdBuku());
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
    public List<Buku> getAllByName(String judul) {
        List<Buku> lstBuku = null;
        try{
            lstBuku = new ArrayList<Buku>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+judul+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                Buku book = new Buku();
                book.setIdBuku(rs.getString("ID_BUKU"));
                book.setJudul(rs.getString("TITLE"));
                book.setPenulis(rs.getString("AUTHOR"));
                book.setPenerbit(rs.getString("PUBLISHER"));
                book.setTahun(rs.getInt("YEAR"));
                lstBuku.add(book);
            }
        }
        catch(SQLException e){
            System.out.println("error"+e);
        }
        return lstBuku;
    }
    
    Connection con;
    //SQL query
    String strRead  = "select ID_BUKU, TITLE, AUTHOR, PUBLISHER, YEAR from buku;";
    String strInsert = "insert into buku (ID_BUKU, TITLE, AUTHOR, PUBLISHER, YEAR) values (?,?,?,?,?);";
    String strUpdate = "update buku set TITLE=?, AUTHOR=?, PUBLISHER=?, YEAR=? where ID_BUKU=? ;";
    String strDelete = "delete from buku where ID_BUKU = ?;";
    String strSearch = "select * from buku where TITLE like ?;";
    
}
