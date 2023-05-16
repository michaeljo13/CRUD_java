/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mvcDAO.DAOHistoryPeminjaman;
import mvcDAO.IDAOHistoryPeminjaman;
import mvcModel.HistoryPeminjaman;
import mvcModel.TabelModelHistoryPeminjaman;
import mvcView.FormHistoryPeminjaman;

/**
 *
 * @author micha
 */
public class ControllerHistory {
    
    public ControllerHistory(FormHistoryPeminjaman frmHistory) {
        this.frmHistory = frmHistory;
        iHistory = new DAOHistoryPeminjaman();
        //iBuku.getAll();
    }
    
    public void isiTable(){
        lstHistory = iHistory.getAll();
        TabelModelHistoryPeminjaman tabelHistory = new TabelModelHistoryPeminjaman(lstHistory);
        frmHistory.getTabelData().setModel(tabelHistory);
    }
    
    public void insert(){
        HistoryPeminjaman hist = new HistoryPeminjaman();
        hist.setIdHistory(frmHistory.gettxtIdHistory().getText());
        hist.setIdAdmin(frmHistory.gettxtIdAdmin().getText());
        hist.setIdBuku(frmHistory.gettxtIdBuku().getText());
        hist.setJudul(frmHistory.gettxtJudul().getText());
        hist.setTgl_peminjaman(frmHistory.gettxtTglPeminjaman().getDate());
        hist.setNama_peminjam(frmHistory.gettxtNamaPeminjam().getText());
        hist.setTgl_pengembalian(frmHistory.gettxtTglPengembalian().getDate());
        iHistory.insert(hist);
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Input Berhasil");
    }
    
    public void reset(){
        if(!frmHistory.gettxtIdHistory().isEnabled())
            frmHistory.gettxtIdHistory().setEnabled(true);
        frmHistory.gettxtIdHistory().setText("");
        frmHistory.gettxtIdAdmin().setText("");
        frmHistory.gettxtIdBuku().setText("");
        frmHistory.gettxtJudul().setText("");
        frmHistory.gettxtTglPeminjaman().setDate(null);
        frmHistory.gettxtNamaPeminjam().setText("");
        frmHistory.gettxtTglPengembalian().setDate(null);
    }
    
    public void isiField(int row){
        frmHistory.gettxtIdHistory().setEnabled(false);
        frmHistory.gettxtIdHistory().setText(lstHistory.get(row).getIdHistory());
        frmHistory.gettxtIdAdmin().setText(lstHistory.get(row).getIdAdmin());
        frmHistory.gettxtIdBuku().setText(lstHistory.get(row).getIdBuku());
        frmHistory.gettxtJudul().setText(lstHistory.get(row).getJudul());
        frmHistory.gettxtTglPeminjaman().setDate(lstHistory.get(row).getTgl_peminjaman());
        frmHistory.gettxtNamaPeminjam().setText(lstHistory.get(row).getNama_peminjam());
        frmHistory.gettxtTglPengembalian().setDate(lstHistory.get(row).getTgl_pengembalian());
    }
    
    public void update(){
        HistoryPeminjaman hist = new HistoryPeminjaman();
        hist.setIdAdmin(frmHistory.gettxtIdAdmin().getText());
        hist.setIdBuku(frmHistory.gettxtIdBuku().getText());
        hist.setJudul(frmHistory.gettxtJudul().getText());
        hist.setTgl_peminjaman(frmHistory.gettxtTglPeminjaman().getDate());
        hist.setNama_peminjam(frmHistory.gettxtNamaPeminjam().getText());
        hist.setTgl_pengembalian(frmHistory.gettxtTglPengembalian().getDate());
        hist.setIdHistory(frmHistory.gettxtIdHistory().getText());
        iHistory.update(hist);
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Update Berhasil");
    }
    
    public  void delete(){
        HistoryPeminjaman hist = new HistoryPeminjaman();
        iHistory.delete(frmHistory.gettxtIdHistory().getText());
        //JOptionPane.showConfirmDialog(null, "Yakin ingin menambahkan?");
        JOptionPane.showMessageDialog(null, "Delete Berhasil");
    }
    
    public void search(){
        lstHistory = iHistory.getAllByName(frmHistory.gettxtCariNama().getText());
        TabelModelHistoryPeminjaman tabelBuku = new TabelModelHistoryPeminjaman(lstHistory);
        frmHistory.getTabelData().setModel(tabelBuku);
    }
    
//    private Date Date(String text) {
//        Date date = Calendar.getInstance().getTime();  
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
//        String strDate = dateFormat.format(date);
//        return null;
//    }
    
    FormHistoryPeminjaman frmHistory;
    IDAOHistoryPeminjaman iHistory;
    List<HistoryPeminjaman> lstHistory;
}
