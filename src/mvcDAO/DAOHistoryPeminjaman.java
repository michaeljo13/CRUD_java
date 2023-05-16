/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcDAO;

import java.sql.Connection;
//import java.sql.Date;
//import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mvcKoneksi.KoneksiDB;
import mvcModel.HistoryPeminjaman;

/**
 *
 * @author micha
 */
public class DAOHistoryPeminjaman implements IDAOHistoryPeminjaman{
    
    public DAOHistoryPeminjaman(){
        con = KoneksiDB.getConnection();
    }
    
    @Override
    public List<HistoryPeminjaman> getAll() {
        List<HistoryPeminjaman> lstHistory = null;
        try{
            lstHistory = new ArrayList<HistoryPeminjaman>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while (rs.next()) {                
                HistoryPeminjaman hist = new HistoryPeminjaman();
                hist.setIdHistory(rs.getString("ID_HISTORY"));
                hist.setIdAdmin(rs.getString("ID_ADMIN"));
                hist.setIdBuku(rs.getString("ID_BUKU"));
                hist.setJudul(rs.getString("TITLE"));
                hist.setTgl_peminjaman(rs.getDate("TGL_PEMINJAMAN"));
                hist.setNama_peminjam(rs.getString("NAMA_PEMINJAM"));
                hist.setTgl_pengembalian(rs.getDate("TGL_PENGEMBALIAN"));
                lstHistory.add(hist);
            }
        }
        catch(SQLException e){
            System.out.println("error"+e);
        }
        return lstHistory;
    }
    
    @Override
    public void insert(HistoryPeminjaman hist) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strInsert);
            statement.setString(1, hist.getIdHistory());
            statement.setString(2, hist.getIdAdmin());
            statement.setString(3, hist.getIdBuku());
            statement.setString(4, hist.getJudul());
            statement.setDate(5, (new java.sql.Date(hist.getTgl_peminjaman().getTime())));
            statement.setString(6, hist.getNama_peminjam());
            statement.setDate(7, (new java.sql.Date(hist.getTgl_pengembalian().getTime())));
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
    public void delete(String idHistory) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strDelete);
            statement.setString(1, idHistory);
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
    public void update(HistoryPeminjaman hist) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(strUpdate);
            statement.setString(1, hist.getIdAdmin());
            statement.setString(2, hist.getIdBuku());
            statement.setString(3, hist.getJudul());
            statement.setDate(4, (new java.sql.Date(hist.getTgl_peminjaman().getTime())));
            statement.setString(5, hist.getNama_peminjam());
            statement.setDate(6, (new java.sql.Date(hist.getTgl_pengembalian().getTime())));
            statement.setString(7, hist.getIdHistory());
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
    public List<HistoryPeminjaman> getAllByName(String nama_peminjam) {
        List<HistoryPeminjaman> lstHistory = null;
        try{
            lstHistory = new ArrayList<HistoryPeminjaman>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+nama_peminjam+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                HistoryPeminjaman hist = new HistoryPeminjaman();
                hist.setIdHistory(rs.getString("ID_HISTORY"));
                hist.setIdAdmin(rs.getString("ID_ADMIN"));
                hist.setIdBuku(rs.getString("ID_BUKU"));
                hist.setJudul(rs.getString("TITLE"));
                hist.setTgl_peminjaman(rs.getDate("TGL_PEMINJAMAN"));
                hist.setNama_peminjam(rs.getString("NAMA_PEMINJAM"));
                hist.setTgl_pengembalian(rs.getDate("TGL_PENGEMBALIAN"));
                lstHistory.add(hist);
            }
        }
        catch(SQLException e){
            System.out.println("error"+e);
        }
        return lstHistory;
    }
    
    Connection con;
    //SQL query
    String strRead  = "select * from history_peminjaman;";
    String strInsert = "insert into history_peminjaman (ID_HISTORY, ID_ADMIN, ID_BUKU, TITLE, TGL_PEMINJAMAN, NAMA_PEMINJAM, TGL_PENGEMBALIAN) values (?,?,?,?,?,?,?);";
    String strUpdate = "update history_peminjaman set ID_ADMIN=?, ID_BUKU=?, TITLE=?, TGL_PEMINJAMAN=?, NAMA_PEMINJAM=?, TGL_PENGEMBALIAN=? where ID_HISTORY=? ;";
    String strDelete = "delete from history_peminjaman where ID_HISTORY = ?;";
    String strSearch = "select * from history_peminjaman where NAMA_PEMINJAM like ?;";
}
